package LLD.UditTutorial.L5_Command_Pattern.Good;

import java.util.List;

import LLD.UditTutorial.L5_Command_Pattern.Good.executors.CommandExecutor;
import LLD.UditTutorial.L5_Command_Pattern.other.Command;

/**
 * Project: DSAlgo
 * Package: LLD.UditTutorial.L5_Command_Pattern.Good
 * <p>
 * User: piyushbajaj
 * Date: 17/04/23
 * Time: 3:54 pm
 */
public class CommandRunnerGood {
    List<CommandExecutor> commandExecutors;

    public CommandRunnerGood(List<CommandExecutor> commandExecutors) {
        this.commandExecutors = commandExecutors;
    }

    public String runCommand(Command command) {
        for (CommandExecutor commandExecutor : commandExecutors) {
            if (commandExecutor.isApplicable(command)) {
                return commandExecutor.execute(command);
            }
        }

        return "Invalid Command";
    }
}
