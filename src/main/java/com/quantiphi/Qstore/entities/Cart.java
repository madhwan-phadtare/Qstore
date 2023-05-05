package com.quantiphi.Qstore.entities;

import lombok.Data;

import java.util.List;

@Data
public class Cart {
    private String cartId;
    private List<String> productIds;
    public String addProduct(String productId){
        productIds.add(productId);
        return "success";
    }

    public String removeProduct(String productId){
        productIds.remove(productId);
        return "success";
    }

}
