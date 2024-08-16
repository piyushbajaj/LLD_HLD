package LLD.Concept_And_Coding.L14_BookMyShow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import LLD.Concept_And_Coding.L14_BookMyShow.Enum.City;
import lombok.Data;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L14_BookMyShow
 * <p>
 * User: piyushbajaj
 * Date: 08/04/23
 * Time: 5:32 pm
 */

@Data
public class S2_MovieController {
    Map<City, List<S1_Movie>> cityWiseMovies;
    Set<S1_Movie> movieList;

    S2_MovieController() {
        cityWiseMovies = new HashMap<>();
        movieList = new HashSet<>();
    }

    public void addMovie(S1_Movie movie, City city) {
        movieList.add(movie);
        List<S1_Movie> movies = cityWiseMovies.getOrDefault(city, new ArrayList<>());
        movies.add(movie);
        cityWiseMovies.put(city, movies);
    }

    public S1_Movie getMovieByName(String movieName) {
        for (S1_Movie movie : movieList) {
            if (movie.getMovieName().equalsIgnoreCase(movieName)) {
                return movie;
            }
        }

        return null;
    }
}
