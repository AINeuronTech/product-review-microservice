package com.commerce.productreviewservices.model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Rating")
public class Rating {
    @Id
    public int id;
    public String rating;

}
