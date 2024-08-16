package LLD.UditTutorial.L6_BookMyShow.services;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import LLD.UditTutorial.L6_BookMyShow.model.S2_Theatre;
import LLD.UditTutorial.L6_BookMyShow.model.S3_Screen;
import LLD.UditTutorial.L6_BookMyShow.model.S4_Seat;
import LLD.UditTutorial.LRU_Cache.exceptions.NotFoundException;
import lombok.NonNull;

/**
 * Project: DSAlgo
 * Package: LLD.UditTutorial.L6_BookMyShow.services
 * <p>
 * User: piyushbajaj
 * Date: 15/04/23
 * Time: 8:07 pm
 */
public class TheatreService {
    private final Map<String, S2_Theatre> theatres;
    private final Map<String, S3_Screen> screens;
    private final Map<String, S4_Seat> seats;

    public TheatreService() {
        this.theatres = new HashMap<>();
        this.screens = new HashMap<>();
        this.seats = new HashMap<>();
    }

    public S4_Seat getSeat(@NonNull final String seatId) {
        if (!seats.containsKey(seatId)) {
            throw new NotFoundException();
        }
        return seats.get(seatId);
    }

    public S2_Theatre getTheatre(@NonNull final String theatreId) {
        if (!theatres.containsKey(theatreId)) {
            throw new NotFoundException();
        }
        return theatres.get(theatreId);
    }

    public S3_Screen getScreen(@NonNull final String screenId) {
        if (!screens.containsKey(screenId)) {
            throw new NotFoundException();
        }
        return screens.get(screenId);
    }

    public S2_Theatre createTheatre(@NonNull final String theatreName) {
        String theatreId = UUID.randomUUID().toString();
        S2_Theatre theatre = new S2_Theatre(theatreId, theatreName);
        theatres.put(theatreId, theatre);
        return theatre;
    }

    public S3_Screen createScreenInTheatre(@NonNull final String screenName, @NonNull final S2_Theatre theatre) {
        S3_Screen screen = createScreen(screenName, theatre);
        theatre.addScreen(screen);
        return screen;
    }

    public S4_Seat createSeatInScreen(@NonNull final Integer rowNo, @NonNull final Integer seatNo,
                                      @NonNull final S3_Screen screen) {
        String seatId = UUID.randomUUID().toString();
        S4_Seat seat = new S4_Seat(seatId, rowNo, seatNo);
        seats.put(seatId, seat);
        screen.addSeat(seat);
        return seat;
    }

    private S3_Screen createScreen(@NonNull final String screenName, @NonNull final S2_Theatre theatre) {
        String screenId = UUID.randomUUID().toString();
        S3_Screen screen = new S3_Screen(screenId, screenName, theatre);
        screens.put(screenId, screen);
        return screen;
    }


}
