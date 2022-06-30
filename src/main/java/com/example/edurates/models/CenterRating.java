package com.example.edurates.models;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "center_rating")
@Entity
public class CenterRating implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "center_id")
    private Center centerId;
    @ManyToOne
    @JoinColumn(name = "rating_id")
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
