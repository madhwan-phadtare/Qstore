package com.quantiphi.Qstore.repositories;

import com.quantiphi.Qstore.entities.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> findAllProducts();
    List<Product> findProductsBySellerId(String sellerId);
    List<Product> findProductsByCategory(String category);
    Product findProductByProductId(String productId);
    Product save(Product product);
    Product updateProduct(Product product);
    Product deleteById(String productId);

}
