package com.xmu.oomall.mapper;

import com.xmu.oomall.model.po.PresaleActivityPo;
import com.xmu.oomall.model.po.PresaleActivityPoExample;
import java.util.List;

public interface PresaleActivityPoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table presale_activity
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table presale_activity
     *
     * @mbg.generated
     */
    int insert(PresaleActivityPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table presale_activity
     *
     * @mbg.generated
     */
    int insertSelective(PresaleActivityPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table presale_activity
     *
     * @mbg.generated
     */
    List<PresaleActivityPo> selectByExample(PresaleActivityPoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table presale_activity
     *
     * @mbg.generated
     */
    PresaleActivityPo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table presale_activity
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(PresaleActivityPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table presale_activity
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(PresaleActivityPo record);
}