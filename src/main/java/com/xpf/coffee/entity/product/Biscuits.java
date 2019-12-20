package com.xpf.coffee.entity.product;

import com.xpf.coffee.entity.Product;

public class Biscuits implements Product {

    private final Integer pId = 0;
    private final String name = "法式马卡龙";
    private final Integer price = 30;
    private final String type = "饼干";

    @Override
    public void sell() {
        System.out.println("法式马卡龙");}

    public Integer getpId() {
        return pId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getPrice() {
        return price;
    }

    @Override
    public String getType() {
        return type;
    }
}