package LLD.UditTutorial.L6_BookMyShow.services;

import java.util.HashMap;
import java.util.Map;

import LLD.UditTutorial.L6_BookMyShow.exceptions.NotFoundException;
import LLD.UditTutorial.L6_BookMyShow.model.S5_Show;
import lombok.NonNull;

/**
 * Project: DSAlgo
 * Package: LLD.UditTutorial.L6_BookMyShow.services
 * <p>
 * User: piyushbajaj
 * Date: 16/04/23
 * Time: 6:34 pm
 */
public class ShowService {
    private final Map<String, S5_Show> shows;

    public ShowService() {
        shows = new HashMap<>();
    }

    public S5_Show getShow(@NonNull final String showId) {
        if (!shows.containsKey(showId)) {
            throw new NotFoundException();
        }
        return shows.get(showId);
    }


}
