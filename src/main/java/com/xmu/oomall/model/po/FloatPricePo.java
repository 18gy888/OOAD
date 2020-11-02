package com.xmu.oomall.model.po;

import java.time.LocalDateTime;

public class FloatPricePo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column float_price.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column float_price.goods_sku_id
     *
     * @mbg.generated
     */
    private Integer goodsSkuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column float_price.activity_price
     *
     * @mbg.generated
     */
    private Integer activityPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column float_price.begin_time
     *
     * @mbg.generated
     */
    private LocalDateTime beginTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column float_price.end_time
     *
     * @mbg.generated
     */
    private LocalDateTime endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column float_price.quantity
     *
     * @mbg.generated
     */
    private Integer quantity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column float_price.created_by
     *
     * @mbg.generated
     */
    private String createdBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column float_price.invalid_by
     *
     * @mbg.generated
     */
    private String invalidBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column float_price.valid
     *
     * @mbg.generated
     */
    private Byte valid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column float_price.id
     *
     * @return the value of float_price.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column float_price.id
     *
     * @param id the value for float_price.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column float_price.goods_sku_id
     *
     * @return the value of float_price.goods_sku_id
     *
     * @mbg.generated
     */
    public Integer getGoodsSkuId() {
        return goodsSkuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column float_price.goods_sku_id
     *
     * @param goodsSkuId the value for float_price.goods_sku_id
     *
     * @mbg.generated
     */
    public void setGoodsSkuId(Integer goodsSkuId) {
        this.goodsSkuId = goodsSkuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column float_price.activity_price
     *
     * @return the value of float_price.activity_price
     *
     * @mbg.generated
     */
    public Integer getActivityPrice() {
        return activityPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column float_price.activity_price
     *
     * @param activityPrice the value for float_price.activity_price
     *
     * @mbg.generated
     */
    public void setActivityPrice(Integer activityPrice) {
        this.activityPrice = activityPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column float_price.begin_time
     *
     * @return the value of float_price.begin_time
     *
     * @mbg.generated
     */
    public LocalDateTime getBeginTime() {
        return beginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column float_price.begin_time
     *
     * @param beginTime the value for float_price.begin_time
     *
     * @mbg.generated
     */
    public void setBeginTime(LocalDateTime beginTime) {
        this.beginTime = beginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column float_price.end_time
     *
     * @return the value of float_price.end_time
     *
     * @mbg.generated
     */
    public LocalDateTime getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column float_price.end_time
     *
     * @param endTime the value for float_price.end_time
     *
     * @mbg.generated
     */
    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column float_price.quantity
     *
     * @return the value of float_price.quantity
     *
     * @mbg.generated
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column float_price.quantity
     *
     * @param quantity the value for float_price.quantity
     *
     * @mbg.generated
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column float_price.created_by
     *
     * @return the value of float_price.created_by
     *
     * @mbg.generated
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column float_price.created_by
     *
     * @param createdBy the value for float_price.created_by
     *
     * @mbg.generated
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column float_price.invalid_by
     *
     * @return the value of float_price.invalid_by
     *
     * @mbg.generated
     */
    public String getInvalidBy() {
        return invalidBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column float_price.invalid_by
     *
     * @param invalidBy the value for float_price.invalid_by
     *
     * @mbg.generated
     */
    public void setInvalidBy(String invalidBy) {
        this.invalidBy = invalidBy == null ? null : invalidBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column float_price.valid
     *
     * @return the value of float_price.valid
     *
     * @mbg.generated
     */
    public Byte getValid() {
        return valid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column float_price.valid
     *
     * @param valid the value for float_price.valid
     *
     * @mbg.generated
     */
    public void setValid(Byte valid) {
        this.valid = valid;
    }
}