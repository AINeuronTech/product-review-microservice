package com.commerce.productreviewservices.rest;

import com.commerce.productreviewservices.model.Rating;
import com.commerce.productreviewservices.model.UserReview;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reviews-data")
public class ReviewResources {
    @RequestMapping("/product/{productId}")
    public Rating getProductReviews(@PathVariable("productId")String productId){
        return new Rating(productId,5);
    }

    @RequestMapping("/user/{userId}")
    public UserReview getUserReviews(@PathVariable("userId")String userId){
        UserReview userReview = new UserReview();
        userReview.initData(userId);
        return userReview;
    }
}
