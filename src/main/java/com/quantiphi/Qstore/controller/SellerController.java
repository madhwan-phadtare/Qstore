package com.quantiphi.Qstore.controller;

import com.quantiphi.Qstore.entities.Product;
import com.quantiphi.Qstore.services.SellerServices;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/seller")
public class SellerController {

    SellerServices sellerServices = new SellerServices();

    @GetMapping("/helloseller")
    public String hello(){
        return "Hello Seller you are connected";
    }

    @PostMapping("/add-product")
    public Product addProduct(@RequestBody Product product){
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
    public List<Product> getAllProduct(@RequestParam("sellerId") String sellerId){
        if(sellerId.equals(""))
            return sellerServices.getAllProducts();
        else
            return sellerServices.getAllProductsBYSellerId(sellerId);

    }

    @GetMapping("/product")
    public Product getProductById(@RequestParam("productId") String productId){
        return sellerServices.getProductBYProductId(productId);
    }

    @PostMapping("/update-product")
    public Product updateProduct(@RequestBody Product product){
        return sellerServices.updateProduct(product);
    }

    @GetMapping("/delete-product")
    public Product deleteProduct(@RequestParam("productId") String productId){
        return sellerServices.deleteProduct(productId);
    }

}
