package mjhct.designpattern.pattern.command;

public class DoorCommand implements Command{

    Object door;

    public DoorCommand(Object door) {
        this.door = door;
    }

    @Override
    public void execute() {
        // door do something
        System.out.println("door open");
    }

    @Override
    public void undo() {
        // door do something
        System.out.println("door close");
    }
}
