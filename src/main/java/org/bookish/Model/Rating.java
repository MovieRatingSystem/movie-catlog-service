package org.bookish.Model;

public class Rating {
    private Integer id;
    private Integer movieId;
    private String rating;

    public Rating() {
    }

    public Rating(Integer id, Integer movieId, String rating) {
        this.id = id;
        this.movieId = movieId;
        this.rating = rating;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }
}
