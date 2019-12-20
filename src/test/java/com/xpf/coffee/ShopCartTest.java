package com.xpf.coffee;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xpf.coffee.entity.Product;
import com.xpf.coffee.entity.ShopCart;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopCartTest {
	@Test
	public void showAllShopCart() throws Exception {
		ShopCart shopCart = ShopCart.getInstance();
		shopCart.addProduct("icetea");
		List<Product> proList = shopCart.showAll();
		for (Product product : proList) {
			System.out.println(product);
		}
	}
}
