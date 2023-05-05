package com.quantiphi.Qstore.services;

import com.quantiphi.Qstore.config.ApplicationConfig;
import com.quantiphi.Qstore.entities.Cart;
import com.quantiphi.Qstore.entities.Product;
import com.quantiphi.Qstore.repositories.CartRepository;
import com.quantiphi.Qstore.repositories.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class CartServices {

    CartRepository cartRepository = ApplicationConfig.cartRepository;
    ProductRepository productRepository = ApplicationConfig.productRepository;

    public String addProduct(String cartId,String productId){
        return cartRepository.addProduct(cartId, productId);
    }

    public String removeProduct(String cartId, String productId){
        return cartRepository.removeProduct(cartId, productId);
    }

    public List<Product> getCart(String cartId){
        Cart cart = cartRepository.getCart(cartId);
        List<String> productIds = cart.getProductIds();
        List<Product> products = new ArrayList<>();
        for(String productId: productIds){
            products.add(productRepository.findProductByProductId(productId));
        }
        return products;
    }

}
