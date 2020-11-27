package cn.edu.xmu.goods.dao;

import cn.edu.xmu.goods.mapper.GrouponActivityPoMapper;
import cn.edu.xmu.goods.model.bo.PresaleActivity;
import cn.edu.xmu.goods.model.po.GrouponActivityPo;
import cn.edu.xmu.goods.model.po.GrouponActivityPoExample;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public class GrouponActivityDao {

    @Autowired
    GrouponActivityPoMapper grouponActivityPoMapper;

    public List<GrouponActivityPo> getActivitiesBySPUId(int page, int pageSize, long id, int timeline){
        PageHelper.startPage(page, pageSize);

        GrouponActivityPoExample example = new GrouponActivityPoExample();
        GrouponActivityPoExample.Criteria criteria = example.createCriteria();
        criteria.andGoodsSpuIdEqualTo(id);

        if (timeline == 0) {
            /* 获取未开始的活动 */
            criteria.andBeginTimeGreaterThan(LocalDateTime.now());
        } else if (timeline == 1) {
            /* 获取明天开始的活动 */
            criteria.andBeginTimeGreaterThan(LocalDateTime.now());
            criteria.andBeginTimeLessThan(LocalDateTime.now().plusDays(1));
        } else if(timeline == 2) {
            /* 获取正在进行中的活动 */
            criteria.andBeginTimeLessThan(LocalDateTime.now());
            criteria.andEndTimeGreaterThan(LocalDateTime.now());
        } else if(timeline == 3) {
            criteria.andEndTimeLessThan(LocalDateTime.now());
        }

        return grouponActivityPoMapper.selectByExample(example);
    }

    public List<GrouponActivityPo> getEffectiveActivities(int page, int pageSize, long shopId, int timeline, long spuId, boolean all){
        PageHelper.startPage(page, pageSize);

        GrouponActivityPoExample example = new GrouponActivityPoExample();
        GrouponActivityPoExample.Criteria criteria = example.createCriteria();

        if (timeline == 0) {
            /* 获取未开始的活动 */
            criteria.andBeginTimeGreaterThan(LocalDateTime.now());
        } else if (timeline == 1) {
            /* 获取明天开始的活动 */
            criteria.andBeginTimeGreaterThan(LocalDateTime.now());
            criteria.andBeginTimeLessThan(LocalDateTime.now().plusDays(1));
        } else if(timeline == 2) {
            /* 获取正在进行中的活动 */
            criteria.andBeginTimeLessThan(LocalDateTime.now());
            criteria.andEndTimeGreaterThan(LocalDateTime.now());
        } else if(timeline == 3) {
            criteria.andEndTimeLessThan(LocalDateTime.now());
        }
        criteria.andShopIdEqualTo(shopId);
        criteria.andGoodsSpuIdEqualTo(spuId);
        if(!all){
            criteria.andStateNotEqualTo(PresaleActivity.PresaleStatus.CANCELED.getCode());
        }

        return grouponActivityPoMapper.selectByExample(example);
    }

    public boolean addActivity(GrouponActivityPo po){
        return grouponActivityPoMapper.insert(po) == 1;
    }

    public boolean delActivity(long id){
        return grouponActivityPoMapper.deleteByPrimaryKey(id) == 1;
    }

    public boolean updateActivity(GrouponActivityPo po, long id) {
        po.setId(id);
        return grouponActivityPoMapper.updateByPrimaryKey(po) == 1;
    }
}
