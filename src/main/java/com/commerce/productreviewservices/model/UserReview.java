package com.commerce.productreviewservices.model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "UserReview")
public class UserReview {
    //@Indexed(unique=true)
    public String userName;
    public int prodId;
    public List<String> rating;

}
