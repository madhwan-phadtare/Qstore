package com.quantiphi.Qstore.repositories;

import com.quantiphi.Qstore.entities.Cart;

import java.util.HashMap;

public class CartRepositoryDummyImpl implements CartRepository {

    HashMap<String, Cart> cartMap = new HashMap<String, Cart>();

    @Override
    public String addProduct(String cartId, String productId) {
        Cart cart = cartMap.get(cartId);
        return cart.addProduct(productId);
    }

    @Override
    public String removeProduct(String cartId, String productId) {
        Cart cart = cartMap.get(cartId);
        return cart.removeProduct(productId);
    }

    @Override
    public Cart getCart(String cartId) {
        return cartMap.get(cartId);
    }
}
