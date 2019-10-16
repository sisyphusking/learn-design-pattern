package command;

public class RebootCommand extends MotherBoard implements Command {
    @Override
    public void execute() {
        reboot();
    }
}
