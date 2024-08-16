package LLD.UditTutorial.L5_Command_Pattern.other;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Project: DSAlgo
 * Package: LLD.UditTutorial.L5_Command_Pattern.other
 * <p>
 * User: piyushbajaj
 * Date: 17/04/23
 * Time: 3:50 pm
 */

@Getter
@AllArgsConstructor
public class Command {
    String name;
    List<String> params;
}
