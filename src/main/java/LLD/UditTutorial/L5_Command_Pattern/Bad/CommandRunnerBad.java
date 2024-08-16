package LLD.UditTutorial.L5_Command_Pattern.Bad;

import LLD.UditTutorial.L5_Command_Pattern.other.Command;
import LLD.UditTutorial.L5_Command_Pattern.other.Database;
import LLD.UditTutorial.L5_Command_Pattern.other.RechargeProvider;
import lombok.AllArgsConstructor;

/**
 * Project: DSAlgo
 * Package: LLD.UditTutorial.L5_Command_Pattern.Bad
 * <p>
 * User: piyushbajaj
 * Date: 17/04/23
 * Time: 3:48 pm
 */

@AllArgsConstructor
public class CommandRunnerBad {
    private final Database database;
    final RechargeProvider rechargeProvider;

    String runCommand(Command command) {
        if ("balance".equals(command.getName())) {
            if (command.getParams().size() != 1) {
                return "Invalid Command";
            }
            String user = command.getParams().get(0);
            return database.getUserBalance(user).toString();
        } else if ("recharge".equals(command.getName())) {
            if (command.getParams().size() != 2) {
                return "Invalid Command";
            }
            String user = command.getParams().get(0);
            Integer rechargeAmount = Integer.parseInt(command.getParams().get(1));

            Integer userBalance = database.getUserBalance(user);
            if (userBalance < rechargeAmount) {
                return "Not sufficient balance";
            }
            rechargeProvider.recharge(user, rechargeAmount);
            return "Recharge Done";
        } else {
            return "Invalid command";
        }
    }

}
