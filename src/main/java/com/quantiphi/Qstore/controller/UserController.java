package com.quantiphi.Qstore.controller;

import com.quantiphi.Qstore.config.ApplicationConfig;
import com.quantiphi.Qstore.entities.Product;
import com.quantiphi.Qstore.entities.Review;
import com.quantiphi.Qstore.services.CartServices;
import com.quantiphi.Qstore.services.ReviewService;
import com.quantiphi.Qstore.services.UserServices;
import org.springframework.context.ApplicationListener;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    CartServices cartServices = ApplicationConfig.cartServices;
    UserServices userServices = ApplicationConfig.userServices;
    ReviewService reviewServices = ApplicationConfig.reviewServices;


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

    @PostMapping("review")
    public String addReview(@RequestBody Review review){
        return reviewServices.addReview(review);
    }

    @GetMapping("review")
    public Review getReview(@RequestParam("reviewId") String reviewId){
        return reviewServices.getReview(reviewId);
    }

}
