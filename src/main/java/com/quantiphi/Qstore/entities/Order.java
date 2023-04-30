package com.quantiphi.Qstore.entities;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class Order {
    private String orderId;
    private String orderStatus;
    private String amount;
    private LocalDateTime dateTime;
    private List<String> productIds;

}
