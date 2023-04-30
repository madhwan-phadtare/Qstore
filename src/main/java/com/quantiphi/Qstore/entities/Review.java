package com.quantiphi.Qstore.entities;

import lombok.Data;
import org.springframework.stereotype.Service;

@Data
public class Review {
    public String reviewId;
    public String UserId;
    public String productId;
    public String reviewMessage;
}
