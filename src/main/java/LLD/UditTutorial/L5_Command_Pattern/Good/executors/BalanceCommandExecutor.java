package LLD.UditTutorial.L5_Command_Pattern.Good.executors;

import LLD.UditTutorial.L5_Command_Pattern.other.Command;
import LLD.UditTutorial.L5_Command_Pattern.other.Database;

/**
 * Project: DSAlgo
 * Package: LLD.UditTutorial.L5_Command_Pattern.Good.executors
 * <p>
 * User: piyushbajaj
 * Date: 17/04/23
 * Time: 3:57 pm
 */
public class BalanceCommandExecutor extends CommandExecutor {

    public static final String BALANCE = "Balance";

    public BalanceCommandExecutor(Database database) {
        super(database);
    }

    @Override
    public Boolean isApplicable(Command command) {
        return command.getName().equals(BALANCE);
    }

    @Override
    protected Boolean isValid(Command command) {
        return command.getParams().size() == 1;
    }

    @Override
    protected String executeValidCommand(Command command) {
        String user = command.getParams().get(0);
        return database.getUserBalance(user).toString();
    }
}
