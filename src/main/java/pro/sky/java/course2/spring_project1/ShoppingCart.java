package pro.sky.java.course2.spring_project1;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class ShoppingCart {
    private List<Integer> cart = new ArrayList();


    public void addCart(List id) {
        cart.addAll(id);
    }

    public List<Integer> getCart() {
        return cart;
    }

}
