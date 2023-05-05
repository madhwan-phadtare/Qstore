package com.quantiphi.Qstore.services;

import com.quantiphi.Qstore.config.ApplicationConfig;
import com.quantiphi.Qstore.entities.Product;
import com.quantiphi.Qstore.repositories.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class UserServices {

    ProductRepository productRepository = ApplicationConfig.productRepository;
    public List<Product> getAllProduct(){
        return productRepository.findAllProducts();
    }

    public List<Product> getProductsByCategory(String category){
        List<Product> allProducts = productRepository.findAllProducts();
        List<Product> products = new ArrayList<>();
        for(Product product : allProducts)
            if(product.getCategory().equals(category))
                products.add(product);
        return products;
    }

    public Product getProductByProductId(String productId){
        return productRepository.findProductByProductId(productId);
    }
}
