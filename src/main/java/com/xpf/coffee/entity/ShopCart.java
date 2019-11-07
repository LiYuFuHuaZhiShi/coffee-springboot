package com.xpf.coffee.entity;

import com.xpf.coffee.web.factory.ProductFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShopCart {
    private ShopCart(){}//构造器私有
    private Map<Integer,Product> map = new HashMap<>();
    /**
     * 静态内部类实现单例购物车
     */
    private static class SingletonShopCart{
        private static final ShopCart instance = new ShopCart();
    }
    /**
     * 获得购物车对象
     * @return 购物车对象
     */
    public static ShopCart getInstance(){
        return SingletonShopCart.instance;
    }

    /**
     * 添加产品
     */
    public void addProduct(String type) throws Exception {
        Product product = ProductFactory.getInstance().getProduct(type);
        if (product!=null){
            map.put(product.getpId(),product);
        }
    }

    /**
     * 查看订单详情
     */
    public List<Product> showAll(){
        List<Product> products = new ArrayList<>();
        for (Integer keys :
                map.keySet()) {
            Product product = map.get(keys);
            products.add(product);
        }
        return products;
    }

    /**
     * 移除商品
     */
    public boolean removeProduct(Integer pId){
        if (map.containsKey(pId)){
            map.remove(pId);
            return true;
        }
        return false;
    }
}
