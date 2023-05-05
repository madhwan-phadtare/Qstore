package com.quantiphi.Qstore.repositories;

import com.quantiphi.Qstore.entities.Cart;

public interface CartRepository {
    String addProduct(String cartId, String productId);
    String removeProduct(String cartId, String productId);
    Cart getCart(String cartId);


}
