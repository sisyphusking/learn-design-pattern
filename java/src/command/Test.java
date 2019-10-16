package command;

public class Test {
    public static void main(String[] args) {
        StartCommand startCommand = new StartCommand();
        RebootCommand rebootCommand = new RebootCommand();

        Box box1 = new Box(startCommand, rebootCommand);
        box1.PressButton1();
        box1.PressButton2();

        Box box2 = new Box(rebootCommand, startCommand);
        box2.PressButton1();
        box2.PressButton2();

    }
}
