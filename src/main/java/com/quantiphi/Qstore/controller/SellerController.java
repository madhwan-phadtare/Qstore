package com.quantiphi.Qstore.controller;

import com.quantiphi.Qstore.DTO.ReviewRequest;
import com.quantiphi.Qstore.entities.Product;
import com.quantiphi.Qstore.entities.Review;
import com.quantiphi.Qstore.services.SellerServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class SellerController {

    SellerServices sellerServices = new SellerServices();

    @GetMapping("/helloseller")
    public String hello(){
        return "Hello Seller";
    }

    @PostMapping("/add-product")
    public Product addProduct(@RequestBody Product product){
//        System.out.println(product);
        product = sellerServices.saveProduct(product);
        return product;
    }

    @PostMapping("/add-products")
    public List<Product> addproducts(@RequestBody List<Product> products){
        List<Product> newProducts = new ArrayList<>();
        for(Product product : products){
            Product newProduct = sellerServices.saveProduct(product);
            newProducts.add(newProduct);
        }
        return newProducts;
    }

    @GetMapping("/products")
    public List<Product> getAllProduct(@RequestBody String sellerId){
        List<Product> products = sellerServices.getAllProductsBYSellerId(sellerId);
        return products;
    }

    @GetMapping("/product")
    public Product getProductById(@RequestBody String productId){
        Product product = sellerServices.getProductBYProductId(productId);
        return product;
    }

    @PostMapping("/update-product")
    public Product updateProduct(@RequestBody Product product){
        Product newProduct = sellerServices.updateProduct(product);
        return newProduct;
    }

    @GetMapping("/delete-product")
    public Product deleteProduct(@RequestBody String productId){
        Product product = sellerServices.deleteProduct(productId);
        return product;
    }

}
