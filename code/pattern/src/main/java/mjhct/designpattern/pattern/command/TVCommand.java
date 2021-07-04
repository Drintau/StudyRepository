package mjhct.designpattern.pattern.command;

public class TVCommand implements Command{

    Object tv;

    public TVCommand(Object tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        // tv do something
        System.out.println("tv startup");
    }

    @Override
    public void undo() {
        // tv do something
        System.out.println("tv shutdown");
    }
}
