package cn.edu.xmu.flashsale.mapper;

import cn.edu.xmu.flashsale.model.po.SKUPo;
import cn.edu.xmu.flashsale.model.po.SKUPoExample;
import java.util.List;

public interface SKUPoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_sku
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_sku
     *
     * @mbg.generated
     */
    int insert(SKUPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_sku
     *
     * @mbg.generated
     */
    int insertSelective(SKUPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_sku
     *
     * @mbg.generated
     */
    List<SKUPo> selectByExample(SKUPoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_sku
     *
     * @mbg.generated
     */
    SKUPo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_sku
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SKUPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_sku
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SKUPo record);
}