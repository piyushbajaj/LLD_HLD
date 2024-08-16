package LLD.UditTutorial.L6_BookMyShow.api;

import LLD.UditTutorial.L6_BookMyShow.model.S2_Theatre;
import LLD.UditTutorial.L6_BookMyShow.model.S3_Screen;
import LLD.UditTutorial.L6_BookMyShow.services.TheatreService;
import lombok.AllArgsConstructor;
import lombok.NonNull;

/**
 * Project: DSAlgo
 * Package: LLD.UditTutorial.L6_BookMyShow.api
 * <p>
 * User: piyushbajaj
 * Date: 16/04/23
 * Time: 2:33 pm
 */

@AllArgsConstructor
public class S1_TheatreController {
    private final TheatreService theatreService;

    public String createTheatre(@NonNull final String theatreName) {
        return theatreService.createTheatre(theatreName).getId();
    }

    public String createScreenInTheatre(@NonNull final String screenName, @NonNull final String theatreId) {
        final S2_Theatre theatre = theatreService.getTheatre(theatreId);
        return theatreService.createScreenInTheatre(screenName, theatre).getId();
    }

    public String createSeatInScreen(@NonNull final Integer rowNo, @NonNull final Integer seatNo,
                                     @NonNull final String screenId) {
        final S3_Screen screen = theatreService.getScreen(screenId);
        return theatreService.createSeatInScreen(rowNo, seatNo, screen).getId();
    }


}
