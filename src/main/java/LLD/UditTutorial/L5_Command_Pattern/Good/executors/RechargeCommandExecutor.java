package LLD.UditTutorial.L5_Command_Pattern.Good.executors;

import LLD.UditTutorial.L5_Command_Pattern.other.Command;
import LLD.UditTutorial.L5_Command_Pattern.other.Database;
import LLD.UditTutorial.L5_Command_Pattern.other.RechargeProvider;

/**
 * Project: DSAlgo
 * Package: LLD.UditTutorial.L5_Command_Pattern.Good.executors
 * <p>
 * User: piyushbajaj
 * Date: 17/04/23
 * Time: 3:58 pm
 */
public class RechargeCommandExecutor extends CommandExecutor {
    RechargeProvider rechargeProvider;

    public static final String RECHARGE = "Recharge";

    public RechargeCommandExecutor(Database database, RechargeProvider rechargeProvider) {
        super(database);
        this.rechargeProvider = rechargeProvider;
    }

    @Override
    public Boolean isApplicable(Command command) {
        return command.getName().equals(RECHARGE);
    }

    @Override
    protected Boolean isValid(Command command) {
        return command.getParams().size() == 2;
    }

    @Override
    protected String executeValidCommand(Command command) {
        String user = command.getParams().get(0);
        Integer rechargeAmount = Integer.parseInt(command.getParams().get(1));

        Integer userBalance = database.getUserBalance(user);
        if (userBalance < rechargeAmount) {
            return "Not sufficient balance";
        }
        rechargeProvider.recharge(user, rechargeAmount);
        return "Recharge Done";
    }
}
