package com.commerce.productreviewservices.model;

import java.util.Arrays;
import java.util.List;

public class UserReview {

    public String userId;
    public List<Rating> ratings;

    public UserReview(){}
    public UserReview(String userId, List<Rating> ratings) {
        this.userId = userId;
        this.ratings = ratings;
    }
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public void initData(String userId) {
        this.setUserId(userId);
        this.setRatings(Arrays.asList(
                new Rating(101, "2.1 not that good"),
                new Rating(102, "3.5 so so")
        ));
    }
}
