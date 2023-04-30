package com.quantiphi.Qstore.entities;

import lombok.Data;

@Data
public class Rating {
    private String ratingId;
    private String userId;
    private String productId;
    private String score;
}
