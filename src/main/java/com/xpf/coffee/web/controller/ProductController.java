package com.xpf.coffee.web.controller;

import com.xpf.coffee.entity.Product;
import com.xpf.coffee.entity.ShopCart;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Controller
public class ProductController {

    /**
     * 跳转到购物车界面
     */
    @RequestMapping(value = "/product/shopcart")
    public String toShopCart(){
        return "user/shoppingcart";
    }

    /**
     * 按照点击的每个产品创建对象，
     * 每个产品对象（单例）--可以进行：
     * 进行操作后添加到session中，
     * 反馈到购物车列表中
     */
    @RequestMapping(value = "/produce/addShop")
    public String addShopCart(String pName, HttpSession session) throws Exception {
        ShopCart shopCart = ShopCart.getInstance();
        shopCart.addProduct(pName);
        List<Product> list = shopCart.showAll();
        session.setAttribute("products",list);
        return "user/shoppingcart";
    }
}
