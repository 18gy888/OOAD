package cn.edu.xmu.goods.dao;

import cn.edu.xmu.goods.mapper.BrandPoMapper;
import cn.edu.xmu.goods.model.po.BrandPo;
import cn.edu.xmu.goods.model.po.BrandPoExample;
import cn.edu.xmu.goods.utility.MyPageHelper;
import cn.edu.xmu.ooad.model.VoObject;
import cn.edu.xmu.goods.model.bo.Brand;
import cn.edu.xmu.ooad.util.ResponseCode;
import cn.edu.xmu.ooad.util.ReturnObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BrandDao {
    @Autowired
    BrandPoMapper brandPoMapper;

    public ReturnObject<Brand> addBrand(Brand brand) {
        BrandPo brandPo = brand.gotBrandPo();
        ReturnObject<Brand> retObj = null;
        try{
            int ret = brandPoMapper.insertSelective(brandPo);
            if (ret == 0) {
                //插入失败
                retObj = new ReturnObject<>(ResponseCode.RESOURCE_ID_NOTEXIST, String.format("新增失败：" + brandPo.getName()));
            } else {
                //插入成功
                brand.setId(brandPo.getId());
                brand.setGmtCreate(LocalDateTime.now());
                brand.setGmtModified(brandPo.getGmtModified());
                retObj = new ReturnObject<>(brand);
            }
        }
        catch (DataAccessException e) {
            // 其他数据库错误
            retObj = new ReturnObject<>(ResponseCode.INTERNAL_SERVER_ERR, String.format("数据库错误：%s", e.getMessage()));
        }
        catch (Exception e) {
            // 其他Exception错误
            retObj = new ReturnObject<>(ResponseCode.INTERNAL_SERVER_ERR, String.format("发生了严重的数据库错误：%s", e.getMessage()));
        }
        return retObj;
    }

    public ReturnObject<Brand> setBrand(Brand brand){
        BrandPo brandPo = brand.gotBrandPo();
        ReturnObject<Brand> retObj = null;
        try{
            int ret = brandPoMapper.updateByPrimaryKeySelective(brandPo);
            if (ret == 0) {
                retObj = new ReturnObject<>(ResponseCode.RESOURCE_ID_NOTEXIST, String.format("品牌id不存在：" + brandPo.getId()));
            } else {
                brand.setGmtModified(brandPo.getGmtModified());
                retObj = new ReturnObject<>();
            }
        }
        catch (DataAccessException e) {
            // 其他数据库错误
            retObj = new ReturnObject<>(ResponseCode.INTERNAL_SERVER_ERR, String.format("数据库错误：%s", e.getMessage()));
        }
        catch (Exception e) {
            // 其他Exception错误
            retObj = new ReturnObject<>(ResponseCode.INTERNAL_SERVER_ERR, String.format("发生了严重的数据库错误：%s", e.getMessage()));
        }
        return retObj;
    }
    public ReturnObject<PageInfo<VoObject>> selectAllBrand(Integer pageNum, Integer pageSize) {
        //分页查询
        PageHelper.startPage(pageNum, pageSize);

        BrandPoExample example = new BrandPoExample();
        List<BrandPo> brandPos = null;
        PageInfo<BrandPo> rolePage = null;
        try {
            //不加限定条件查询所有
            brandPos = brandPoMapper.selectByExample(example);
            rolePage = PageInfo.of(brandPos);
        }catch (DataAccessException e){
            return new ReturnObject<>(ResponseCode.INTERNAL_SERVER_ERR, String.format("数据库错误：%s", e.getMessage()));
        }

        List<VoObject> ret = new ArrayList<>(brandPos.size());
        for (BrandPo po : rolePage.getList()) {
            Brand brand = new Brand(po);
            ret.add(brand);
        }
        PageInfo<VoObject> returnList = new PageInfo<>(ret);
        MyPageHelper.transferPageParams(rolePage, returnList);
        return new ReturnObject<>(returnList);
    }
    public ReturnObject<Object> deleteBrandById(Long id) {
        ReturnObject<Object> retObj = null;
        int ret = brandPoMapper.deleteByPrimaryKey(id);
        if (ret == 0) {
            retObj = new ReturnObject<>(ResponseCode.RESOURCE_ID_NOTEXIST, String.format("品牌id不存在：" + id));
        }
        else{
            retObj = new ReturnObject<>();
        }
        return retObj;
    }
    public ReturnObject<Brand> getBrandById(long id) {
        BrandPo brandPo = brandPoMapper.selectByPrimaryKey(id);
        if (brandPo == null) {
            return new ReturnObject(ResponseCode.RESOURCE_ID_NOTEXIST);
        }
        Brand brand = new Brand(brandPo);
        return new ReturnObject<>(brand);
    }

    public boolean hasSameName(String name){
        BrandPoExample example =new BrandPoExample();
        BrandPoExample.Criteria criteria = example.createCriteria();
        criteria.andNameEqualTo(name);

        var res = brandPoMapper.selectByExample(example);
        return !res.isEmpty();
    }

}
