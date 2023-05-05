package com.quantiphi.Qstore.controller;

import com.quantiphi.Qstore.entities.Product;
import com.quantiphi.Qstore.services.CartServices;
import com.quantiphi.Qstore.services.UserServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    CartServices cartServices = new CartServices();
    UserServices userServices = new UserServices();

    @GetMapping("/helloUser")
    public String hello(){
        return "Hello User you are connected";
    }

    @GetMapping("/products")
    public List<Product> getAllProduct(@RequestParam("category") String category){
        if(category.equals(""))
            return userServices.getAllProduct();
        else
            return userServices.getProductsByCategory(category);
    }

    @GetMapping("/product")
    public Product getProductByProductId(@RequestParam("productId") String productId){
        return userServices.getProductByProductId(productId);
    }

    @GetMapping("/cart/add")
    public String addProductToCart(@RequestParam("cartId") String cartId,
                                                     @RequestParam("productId") String productId){
        return cartServices.addProduct(cartId, productId);
    }

    @GetMapping("/cart/remove")
    public String removeProductFromCart(@RequestParam("cartId") String cartId,
                                   @RequestParam("productId") String productId){
        return cartServices.removeProduct(cartId, productId);
    }

    @GetMapping("cart")
    public List<Product> fetchCart(@RequestParam("cartId") String cartId){
        return cartServices.getCart(cartId);
    }

}
