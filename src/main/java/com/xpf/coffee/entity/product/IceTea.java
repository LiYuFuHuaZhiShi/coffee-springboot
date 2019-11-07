package com.xpf.coffee.entity.product;

import com.xpf.coffee.entity.Product;

public class IceTea implements Product {

    private final Integer pId = 2;
    private final String name = "冰摇红莓黑加仑茶®";
    private final Integer price = 15;
    private final String type = "冰茶";

    @Override
    public void sell() {
        System.out.println("冰摇红莓黑加仑茶®");
    }

    public Integer getpId() {
        return pId;
    }

    @Override
    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String getType() {
        return type;
    }
}
