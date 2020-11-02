package com.xmu.oomall.mapper;

import com.xmu.oomall.model.po.FloatPricePo;
import com.xmu.oomall.model.po.FloatPricePoExample;
import java.util.List;

public interface FloatPricePoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table float_price
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table float_price
     *
     * @mbg.generated
     */
    int insert(FloatPricePo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table float_price
     *
     * @mbg.generated
     */
    int insertSelective(FloatPricePo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table float_price
     *
     * @mbg.generated
     */
    List<FloatPricePo> selectByExample(FloatPricePoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table float_price
     *
     * @mbg.generated
     */
    FloatPricePo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table float_price
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FloatPricePo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table float_price
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FloatPricePo record);
}