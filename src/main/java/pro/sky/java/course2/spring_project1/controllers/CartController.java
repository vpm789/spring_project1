package pro.sky.java.course2.spring_project1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.spring_project1.services.CartService;

import java.util.List;

@RestController
@RequestMapping("order")
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/add")
    public void add(@RequestParam("id") List<Integer> id) {
        cartService.add(id);
    }

    @GetMapping("/get")
    public List<Integer> get() {
        return cartService.get();
    }
}
