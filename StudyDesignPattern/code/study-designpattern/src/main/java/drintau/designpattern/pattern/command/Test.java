package drintau.designpattern.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令模式
 */
public class Test {

    public static void main(String[] args) {
        List<Command> commands = new ArrayList<>(16);
        Command command = new DoorCommand(new Object());
        commands.add(command);
        command = new TVCommand(new Object());
        commands.add(command);

        int size = commands.size();
        for (int i=0; i<size; i++) {
            commands.get(i).execute();
        }

        for (int i = size-1; i >= 0; i--) {
            commands.get(i).undo();
        }
    }

}
