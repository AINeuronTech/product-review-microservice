package com.commerce.productreviewservices.repository;

import com.commerce.productreviewservices.model.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RatingRepository extends MongoRepository<Rating,Integer> {


}
