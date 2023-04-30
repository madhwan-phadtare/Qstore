package com.quantiphi.Qstore.services;

import com.quantiphi.Qstore.entities.Product;
import com.quantiphi.Qstore.repositories.ProductRepository;
import com.quantiphi.Qstore.repositories.ProductRepositoryDummyImpl;

import java.util.ArrayList;
import java.util.List;

public class SellerServices {
    ProductRepository productRepository = new ProductRepositoryDummyImpl();

    public Product saveProduct(Product product)
    {
        if(product.getAvgRating()==null)
            product.setAvgRating("0");
        if(product.getRatingIds()==null)
            product.setRatingIds(new ArrayList<String>());
        if(product.getReviewIds()==null)
            product.setReviewIds(new ArrayList<String>());
        product = productRepository.save(product);
        return product;
    }

    public List<Product> getAllProductsBYSellerId(String sellerId){
        List<Product> products = productRepository.findProductsBySellerId(sellerId);
        return products;
    }

    public Product getProductBYProductId(String productId){
        Product product = productRepository.findProductByProductId(productId);
        return product;
    }

    public Product updateProduct(Product product){
        Product newProduct = productRepository.updateProduct(product);
        System.out.println("product updated");
        return product;
    }

    public Product deleteProduct(String productId){
        Product product = productRepository.deleteById(productId);
        return product;
    }

}
