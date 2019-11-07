package com.xpf.coffee.web.factory;


import com.xpf.coffee.entity.Product;
import com.xpf.coffee.entity.product.Biscuits;
import com.xpf.coffee.entity.product.IceJuice;
import com.xpf.coffee.entity.product.IceTea;


/**
 * 产品工厂--简单工厂+单例
 */
public class ProductFactory {
    private ProductFactory(){}
    private static class SingletonProductFactory{
        private static final ProductFactory instance = new ProductFactory();
    }
    public static ProductFactory getInstance(){
        return SingletonProductFactory.instance;
    }

    /**
     * 根据传入值创建产品
     * @param type 想要创建的产品
     * @return 产品
     */
    public Product getProduct(String type) throws Exception {

        if ("biscuits".equalsIgnoreCase(type)) {
            return new Biscuits();
        } else if ("icejuice".equalsIgnoreCase(type)) {
            return new IceJuice();
        } else if ("icetea".equalsIgnoreCase(type)){
            return new IceTea();
        }else {
            return null;
        }
    }
}
