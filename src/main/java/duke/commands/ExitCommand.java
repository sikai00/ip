package duke.commands;

import duke.utils.Storage;
import duke.utils.TaskList;

/**
 * Represents an executable command to exit the program.
 *
 * @author sikai00
 */
public class ExitCommand extends Command {
    /** Command identifier used by Parser **/
    public static final String COMMAND_WORD = "bye";

    /**
     * {@inheritDoc}
     */
    @Override
    public CommandResult execute(TaskList taskList, Storage storage) {
        String msg = "Bye. Hope to see you again soon!\n(exiting in a second...)";
        storage.writeAllToStorage(taskList);
        return new CommandResult(msg, true);
    }
}
