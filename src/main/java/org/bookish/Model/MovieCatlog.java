package org.bookish.Model;

public class MovieCatlog {

    private Integer id;
    private Integer movieId;
    private String name;
    private String rating;
    private String desc;

    public MovieCatlog() {
    }

    public MovieCatlog(Integer id, Integer movieId, String name, String rating, String desc) {
        this.id = id;
        this.movieId = movieId;
        this.name = name;
        this.rating = rating;
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
