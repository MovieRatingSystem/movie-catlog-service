package org.bookish.Model;

import java.util.List;

public class RatingList {

    private List<Rating> ratings;

    public RatingList() {
    }

    public RatingList(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }
}
