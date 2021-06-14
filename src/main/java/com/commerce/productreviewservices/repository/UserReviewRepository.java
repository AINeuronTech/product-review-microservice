package com.commerce.productreviewservices.repository;

import com.commerce.productreviewservices.model.UserReview;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserReviewRepository extends MongoRepository<UserReview,Integer> {


}
