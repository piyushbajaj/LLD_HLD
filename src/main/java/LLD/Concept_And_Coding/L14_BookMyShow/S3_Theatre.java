package LLD.Concept_And_Coding.L14_BookMyShow;

import java.util.List;

import LLD.Concept_And_Coding.L14_BookMyShow.Enum.City;
import lombok.Data;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L14_BookMyShow
 * <p>
 * User: piyushbajaj
 * Date: 08/04/23
 * Time: 5:52 pm
 */

@Data
public class S3_Theatre {
    int theatreId;
    String address;
    City city;
    List<S4_Screen> screenList;
    List<S5_Show> showList;

}
