package com.example.edurates.entities;

import javax.persistence.*;

@Table(name = "center_rating")
@Entity
public class CenterRating {

    @Id
    @ManyToOne
    @Column(name = "center_id")
    private Center centerId;
    @ManyToOne
    @Column(name = "rating_id")
    private Rating ratingId;

    public CenterRating() {
    }

    public CenterRating(Center centerId, Rating ratingId) {
        this.centerId = centerId;
        this.ratingId = ratingId;
    }

    public Center getCenterId() {
        return centerId;
    }

    public void setCenterId(Center centerId) {
        this.centerId = centerId;
    }

    public Rating getRatingId() {
        return ratingId;
    }

    public void setRatingId(Rating ratingId) {
        this.ratingId = ratingId;
    }

    @Override
    public String toString() {
        return "CenterRating{" +
                "centerId=" + centerId +
                ", ratingId=" + ratingId +
                '}';
    }
}
