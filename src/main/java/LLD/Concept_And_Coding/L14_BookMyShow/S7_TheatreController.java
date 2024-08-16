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
 * Time: 6:07 pm
 */

@Data
public class S7_TheatreController {
    Map<City, List<S3_Theatre>> cityWiseTheatre;
    Set<S3_Theatre> allTheatres;

    S7_TheatreController() {
        cityWiseTheatre = new HashMap<>();
        allTheatres = new HashSet<>();
    }

    public void addTheatre(S3_Theatre theatre, City city) {
        allTheatres.add(theatre);
        List<S3_Theatre> theatres = cityWiseTheatre.getOrDefault(city, new ArrayList<>());
        theatres.add(theatre);
        cityWiseTheatre.put(city, theatres);
    }

    public Map<S3_Theatre, List<S5_Show>> getTheatreWiseShows(S1_Movie movie, City city) {
        Map<S3_Theatre, List<S5_Show>> theatreWiseShows = new HashMap<>();
        List<S3_Theatre> theatres = cityWiseTheatre.get(city);

        for (S3_Theatre theatre : theatres) {
            List<S5_Show> givenMovieShows = new ArrayList<>();
            List<S5_Show> showList = theatre.getShowList();

            for (S5_Show show : showList) {
                if (show.getMovie().getMovieId() == movie.getMovieId()) {
                    givenMovieShows.add(show);
                }
            }

            theatreWiseShows.put(theatre, givenMovieShows);
        }
        return theatreWiseShows;
    }
}
