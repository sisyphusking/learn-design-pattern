package command;

public class StartCommand extends MotherBoard implements Command{

    @Override
    public void execute() {
        start();
    }
}
