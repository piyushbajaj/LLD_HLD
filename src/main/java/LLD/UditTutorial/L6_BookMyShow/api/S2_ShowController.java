package LLD.UditTutorial.L6_BookMyShow.api;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import LLD.UditTutorial.L6_BookMyShow.model.S3_Screen;
import LLD.UditTutorial.L6_BookMyShow.model.S4_Seat;
import LLD.UditTutorial.L6_BookMyShow.model.S5_Show;
import LLD.UditTutorial.L6_BookMyShow.services.MovieService;
import LLD.UditTutorial.L6_BookMyShow.services.SeatAvailabilityService;
import LLD.UditTutorial.L6_BookMyShow.services.ShowService;
import LLD.UditTutorial.L6_BookMyShow.services.TheatreService;
import lombok.AllArgsConstructor;
import lombok.NonNull;

/**
 * Project: DSAlgo
 * Package: LLD.UditTutorial.L6_BookMyShow.api
 * <p>
 * User: piyushbajaj
 * Date: 17/04/23
 * Time: 2:22 pm
 */

@AllArgsConstructor
public class S2_ShowController {
    private final SeatAvailabilityService seatAvailabilityService;
    private final ShowService showService;
    private final TheatreService theatreService;
    private final MovieService movieService;

    public String createShow(@NonNull final String movieId, @NonNull final String screenId,
                             @NonNull final Date startTime, @NonNull final Integer durationInSeconds) {
        final S3_Screen screen = theatreService.getScreen(screenId);
//        final S1_Movie movie = movieService.getMovie(movieId);
//        return showService.createShow(movie, screen, startTime, durationInSeconds).getId();
        return "";
    }

    public List<String> getAvailableSeats(@NonNull final String showId) {
        final S5_Show show = showService.getShow(showId);
        final List<S4_Seat> availableSeats = seatAvailabilityService.getAvailableSeats(show);
        return availableSeats.stream().map(S4_Seat::getId).collect(Collectors.toList());
    }
}
