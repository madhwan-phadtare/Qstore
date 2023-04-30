package com.quantiphi.Qstore.repositories;

import com.quantiphi.Qstore.entities.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductRepositoryDummyImpl implements ProductRepository{
    HashMap<String, Product> productMap = new HashMap<>();
    String autoIncrement = "1";

    @Override
    public List<Product> findAllProducts() {
        List<Product> products = new ArrayList<>(productMap.values());
        return products;

    }

    @Override
    public List<Product> findProductsBySellerId(String sellerId) {

        List<Product> products = new ArrayList<>();
        List<Product> allProducts = findAllProducts();

        for(Product product : allProducts){
            if(product.getSellerId().equals(sellerId)){
                products.add(product);
            }
        }
        return products;

    }

    @Override
    public List<Product> findProductsByCategory(String category) {
        List<Product> products = new ArrayList<>();
        List<Product> allProducts = findAllProducts();

        for(Product product : allProducts){
            if(product.getCategory().equals(category))
                products.add(product);
        }

        return products;
    }

    @Override
    public Product findProductByProductId(String productId) {
        if(productMap.containsKey(productId))
            return productMap.get(productId);
        else
            return null;
    }

    @Override
    public Product save(Product product) {

        product.setProductId(autoIncrement);

        productMap.put(product.getProductId(), product);

        int number = Integer.parseInt(autoIncrement);
        number++;
        autoIncrement = Integer.toString(number);

        System.out.println("Product Saved");
        System.out.println(productMap.size());

        return product;
    }

    @Override
    public Product updateProduct(Product product) {
        productMap.put(product.getProductId(), product);
        return product;
    }

    @Override
    public Product deleteById(String productId) {
        if(productMap.containsKey(productId)){
            Product product = productMap.get(productId);
            productMap.remove(productId);
            return product;
        }
        return null;
    }
}
