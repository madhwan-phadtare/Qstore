package com.quantiphi.Qstore.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private String productId;
    private String sellerId;
    private String productName;
    private String description;
    private String category;
    private String price;
    private String avgRating;
    private List<String> imageUrl;
    private List<String> reviewIds;
    private List<String> ratingIds;


}
