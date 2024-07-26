package org.bookish.Controller;

import org.bookish.Model.Movie;
import org.bookish.Model.MovieCatlog;
import org.bookish.Model.Rating;
import org.bookish.Model.RatingList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class CatlogController {


    @Autowired
    RestTemplate restTemplate;

    @Value("${movie.info.service.url}")
    private String movieInfoServiceURL;

    @Value("${rating.data.service.url}")
    private String ratingDataServiceURL;

    @RequestMapping("users/{userId}")
    public List<MovieCatlog> getCatlogItems(@PathVariable Integer userId){
        RatingList ratingList = restTemplate.getForObject(ratingDataServiceURL +userId , RatingList.class);
       /* List<Rating> l = Arrays.asList(
                new Rating(1,1,"4"),
                new Rating(2,2,"5"),
                new Rating(3,3,"3")
        );
        RatingList ratingList = new RatingList();
        ratingList.setRatings(l);
    */
        return ratingList.getRatings().stream().map(rating -> {
            Movie movie = restTemplate.getForObject(movieInfoServiceURL+ rating.getMovieId(), Movie.class);
            MovieCatlog movieCatlog = new MovieCatlog(movie.getId(), movie.getId(), movie.getName(), rating.getRating(), movie.getDesc());
            return movieCatlog;
        }).toList();

    }

}
