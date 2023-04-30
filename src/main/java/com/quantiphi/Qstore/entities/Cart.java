package com.quantiphi.Qstore.entities;

import lombok.Data;

import java.util.List;

@Data
public class Cart {
    private String cartId;
    private String userid;
    private List<String> productIds;
    private String amount;
}
