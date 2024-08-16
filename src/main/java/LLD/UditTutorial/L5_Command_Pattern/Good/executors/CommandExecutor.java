package LLD.UditTutorial.L5_Command_Pattern.Good.executors;

import LLD.UditTutorial.L5_Command_Pattern.other.Command;
import LLD.UditTutorial.L5_Command_Pattern.other.Database;
import lombok.AllArgsConstructor;

/**
 * Project: DSAlgo
 * Package: LLD.UditTutorial.L5_Command_Pattern.Good.executors
 * <p>
 * User: piyushbajaj
 * Date: 17/04/23
 * Time: 3:55 pm
 */

@AllArgsConstructor
public abstract class CommandExecutor {
    protected Database database;

    public String execute(final Command command) {
        if (!isValid(command)) {
            return "Invalid Command";
        }
        return executeValidCommand(command);
    }

    public abstract Boolean isApplicable(final Command command);

    protected abstract Boolean isValid(final Command command);

    protected abstract String executeValidCommand(final Command command);
}
