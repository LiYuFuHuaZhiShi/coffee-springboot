package com.xpf.coffee.entity;

/**
 * 产品接口
 */
public interface Product {

    /**
     * 售卖
     */
    void sell();

    /**
     * 得到产品id号
     * @return 产品id号
     */
    Integer getpId();

    /**
     * 得到产品名称
     */
    String getName();

    /**
     * 得到产品类型
     */
    String getType();

    /**
     * 得到产品价格
     */
    Integer getPrice();
}


