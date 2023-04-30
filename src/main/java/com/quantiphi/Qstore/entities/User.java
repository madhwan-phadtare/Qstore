package com.quantiphi.Qstore.entities;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private String userId;
    private String cartId;
    private String name;
    private String emailId;
    private List<String> orderIds;
}