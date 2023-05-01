package com.quantiphi.Qstore.entities;

import lombok.Data;

import java.util.List;

@Data
public class Seller {
    private String sellerId;
    private String sellerName;
    private List<String> products;
}
