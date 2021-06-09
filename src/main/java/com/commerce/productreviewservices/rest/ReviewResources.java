package com.commerce.productreviewservices.rest;

import com.commerce.productreviewservices.model.Rating;
import com.commerce.productreviewservices.model.UserReview;
import com.commerce.productreviewservices.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reviews-data")
public class ReviewResources {

    @Autowired
    private RatingRepository ratingRepository;

    @PostMapping("/createRating")
    public String saveRating(@RequestBody Rating rating){
        ratingRepository.save(rating);
        return rating.getId() + " review is created";
    }

    @PutMapping("/updateRating")
    public String updateRating(@RequestBody Rating rating){
        ratingRepository.save(rating);
        return rating.getId()+ " review is updated";
    }

    @GetMapping("/findRating")
    public List<Rating> readRatings(){
        return ratingRepository.findAll();
    }

    @GetMapping("/findRating/{id}")
    public Optional<Rating> readRating(@PathVariable int id){
        return ratingRepository.findById(id);
    }

    @DeleteMapping("/deleteRating/{id}")
    public String deleteRating(@PathVariable int id){
        ratingRepository.deleteById(id);
        return "Review "+id +" is deleted";
    }

    /*@RequestMapping("/product/{productId}")
    public Rating getProductReviews(@PathVariable("productId")String productId){
        return new Rating(productId,5);
    } */

    @RequestMapping("/delete/{userId}")
    public UserReview getUserReviews(@PathVariable("userId")String userId){
        UserReview userReview = new UserReview();
        userReview.initData(userId);
        return userReview;
    }
}
