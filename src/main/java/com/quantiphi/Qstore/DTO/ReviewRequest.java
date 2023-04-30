package com.quantiphi.Qstore.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@Entity(name = "ReviewRequest")
public class ReviewRequest {

    private String reviewMessage;

    public ReviewRequest(String reviewMessage)
    {
        this.reviewMessage = reviewMessage;
    }

}
