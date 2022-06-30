package com.example.edurates.controllers;

import com.example.edurates.models.Rating;
import com.example.edurates.models.Type;
import com.example.edurates.service.RatingService;
import com.example.edurates.service.TypeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rating")
public class RatingController {

    private RatingService ratingService;

    public RatingController(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    @GetMapping(value = "/getAll")
    public List<Rating> getAllRatings() {
        List<Rating> ratings;
        ratings = ratingService.getAll();
        return ratings;
    }

    @GetMapping(value = "/getById/{id}")
    public Rating getRatingById(@PathVariable(value = "id") Long id) {
        Rating rating;
        rating = ratingService.getById(id);
        return rating;
    }

    @PostMapping(value = "/create")
    public Rating saveRating(@RequestBody Rating rating) {
        ratingService.create(rating);
        return rating;
    }

    @PutMapping(value = "/update")
    public Rating updateRating(@RequestBody Rating rating) {
        ratingService.update(rating);
        return rating;
    }
}
