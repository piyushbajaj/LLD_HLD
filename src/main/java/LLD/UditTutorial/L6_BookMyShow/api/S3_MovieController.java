package LLD.UditTutorial.L6_BookMyShow.api;

import LLD.UditTutorial.L6_BookMyShow.services.MovieService;
import lombok.AllArgsConstructor;
import lombok.NonNull;

/**
 * Project: DSAlgo
 * Package: LLD.UditTutorial.L6_BookMyShow.api
 * <p>
 * User: piyushbajaj
 * Date: 17/04/23
 * Time: 2:24 pm
 */

@AllArgsConstructor
public class S3_MovieController {
    private final MovieService movieService;

    public String createMovie(@NonNull final String movieName) {
//        return movieService.createMovie(movieName).getId();
        return "";
    }
}
