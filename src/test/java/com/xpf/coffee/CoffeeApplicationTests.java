package com.xpf.coffee;

import com.xpf.coffee.entity.Product;
import com.xpf.coffee.entity.ShopCart;
import com.xpf.coffee.entity.User;
import com.xpf.coffee.util.UserList;
import com.xpf.coffee.web.factory.ProductFactory;
import org.apache.ibatis.annotations.Param;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CoffeeApplicationTests {

    @Test
    public void test01() {
        UserList u = UserList.getInstance();
        UserList u2 = UserList.getInstance();
        System.out.println(u);
        System.out.println(u2);
    }

    @Test
    public void test02() throws Exception {
        ProductFactory p = ProductFactory.getInstance();
        Product pro = p.getProduct("biscuits");
        System.out.println(pro);
    }

}
