package com.xpf.coffee.entity.product;

import com.xpf.coffee.entity.Product;

public class IceJuice implements Product {

    private final Integer pId = 1;
    private final String name = "香草风味星冰乐";
    private final Integer price = 18;
    private final String type = "冰乐";

    @Override
    public void sell() {
            System.out.println("香草风味星冰乐");}

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



