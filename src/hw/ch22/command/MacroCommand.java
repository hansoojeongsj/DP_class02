package hw.ch22.command;

import java.util.ArrayDeque;
import java.util.Deque;
//import java.util.LinkedList;

public class MacroCommand implements Command {
    // 명령의 배열 
    private Deque<Command> commands = new ArrayDeque<>();
    private Deque<Command> commandsForRedo = new ArrayDeque<>();

    @Override
    public void execute() {
        for (Command cmd : commands) {
            cmd.execute();
        }
    }

    public void append(Command cmd) {
        if (cmd == this) {
            throw new IllegalArgumentException("infinite loop caused by append");
        }
        commands.push(cmd);
    }

    public void undo() {
        if (!commands.isEmpty()) {
            Command cmd = commands.pop();
            commandsForRedo.push(cmd);
        }
    }

    public void redo() {
        if (!commandsForRedo.isEmpty()) {
            Command cmd = commandsForRedo.pop();
            commands.push(cmd);
        }
    }

    public void clear() {
        commands.clear();
        commandsForRedo.clear();
    }
}
