package cn.edu.xmu.goods.mapper;

import cn.edu.xmu.goods.model.po.CategoryPo;
import cn.edu.xmu.goods.model.po.CategoryPoExample;
import java.util.List;

public interface CategoryPoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_category
     *
     * @mbg.generated
     */
    int deleteByExample(CategoryPoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_category
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_category
     *
     * @mbg.generated
     */
    int insert(CategoryPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_category
     *
     * @mbg.generated
     */
    int insertSelective(CategoryPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_category
     *
     * @mbg.generated
     */
    List<CategoryPo> selectByExample(CategoryPoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_category
     *
     * @mbg.generated
     */
    CategoryPo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_category
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CategoryPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_category
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CategoryPo record);
}