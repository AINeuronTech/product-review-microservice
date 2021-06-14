package com.commerce.productreviewservices.rest;

import com.commerce.productreviewservices.model.Rating;
import com.commerce.productreviewservices.model.UserReview;
import com.commerce.productreviewservices.repository.RatingRepository;
import com.commerce.productreviewservices.repository.UserReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user-reviews-data")
public class UserReviewResources {

    @Autowired
    private UserReviewRepository userReviewRepository;

    @PostMapping("/createReview")
    public String saveRating(@RequestBody UserReview rating){
        userReviewRepository.save(rating);
        return rating.getProdId() + " review is created";
    }

    @PutMapping("/updateReview")
    public String updateRating(@RequestBody UserReview rating){
        userReviewRepository.save(rating);
        return rating.getProdId()+ " review is updated";
    }

    @GetMapping("/findReview")
    public List<UserReview> readRatings(){
        return userReviewRepository.findAll();
    }

    @GetMapping("/findReview/{id}")
    public Optional<UserReview> readRating(@PathVariable int id){
        return userReviewRepository.findById(id);
    }

    @DeleteMapping("/deleteReview/{id}")
    public String deleteRating(@PathVariable int id){
        userReviewRepository.deleteById(id);
        return "Review "+id +" is deleted";
    }

}
