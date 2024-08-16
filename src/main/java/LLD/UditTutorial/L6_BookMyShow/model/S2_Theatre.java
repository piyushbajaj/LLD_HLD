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
 * Time: 6:27 pm
 */

@Getter
public class S2_Theatre {
    private final String id;
    private final String name;
    private final List<S3_Screen> screens;

    public S2_Theatre(@NonNull final String id, @NonNull final String name) {
        this.id = id;
        this.name = name;
        this.screens = new ArrayList<>();
    }

    public void addScreen(@NonNull final S3_Screen screen) {
        screens.add(screen);
    }
}
