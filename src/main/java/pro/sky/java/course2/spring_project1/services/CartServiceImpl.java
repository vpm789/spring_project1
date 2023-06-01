package pro.sky.java.course2.spring_project1.services;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.spring_project1.ShoppingCart;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    private final ShoppingCart shoppingCart;

    public CartServiceImpl(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public void add(List id) {
        shoppingCart.addCart(id);
    }

    @Override
    public List<Integer> get() {
        return shoppingCart.getCart();
    }
}
