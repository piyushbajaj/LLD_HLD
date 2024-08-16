package LLD.UditTutorial.L6_BookMyShow.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Project: DSAlgo
 * Package: LLD.UditTutorial.L6_BookMyShow
 * <p>
 * User: piyushbajaj
 * Date: 15/04/23
 * Time: 6:36 pm
 */

@AllArgsConstructor
@Getter
public class S5_Show {
    private final String id;
    private final S1_Movie movie;
    private final S3_Screen screen;
    private final Date startTime;
    private final Integer durationInSec;
}
