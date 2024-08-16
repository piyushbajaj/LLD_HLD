package LLD.UditTutorial.L6_BookMyShow.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NonNull;

/**
 * Project: DSAlgo
 * Package: LLD.UditTutorial.L6_BookMyShow
 * <p>
 * User: piyushbajaj
 * Date: 15/04/23
 * Time: 6:26 pm
 */

@Getter
public class S3_Screen {
    private final String id;
    private final String name;
    private final S2_Theatre theatre;
    private final List<S4_Seat> seats;

    public S3_Screen(@NonNull final String id, @NonNull final String name, @NonNull final S2_Theatre theatre) {
        this.id = id;
        this.name = name;
        this.theatre = theatre;
        this.seats = new ArrayList<>();
    }

    public void addSeat(@NonNull final S4_Seat seat) {
        this.seats.add(seat);
    }
}
