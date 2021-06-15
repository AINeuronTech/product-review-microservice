package com.commerce.productreviewservices.rest;

import brave.sampler.Sampler;
import com.commerce.productreviewservices.model.Rating;
import com.commerce.productreviewservices.model.UserReview;
import com.commerce.productreviewservices.repository.RatingRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reviews-data")
public class ReviewResources {

    private final org.slf4j.Logger log = LoggerFactory.getLogger(ReviewResources.class);

    @Autowired
    private RatingRepository ratingRepository;

    @Bean
    public Sampler defaultSampler(){
        return Sampler.ALWAYS_SAMPLE;
    }

    @PostMapping("/createRating")
    public String saveRating(@RequestBody Rating rating){
        log.info(rating + " has been called");
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
        log.info("product "+ id +" has been called for reviews");
        return ratingRepository.findById(id);
    }

    @DeleteMapping("/deleteRating/{id}")
    public String deleteRating(@PathVariable int id){
        ratingRepository.deleteById(id);
        return "Review "+id +" is deleted";
    }

}
