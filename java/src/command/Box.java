package command;

public class Box {
    private Command botton1;
    private Command botton2;
    public Box(Command botton1, Command botton2){
        this.botton1 = botton1;
        this.botton2 = botton2;
    }
    public void  PressButton1(){
        this.botton1.execute();
    }

    public void PressButton2(){
        this.botton2.execute();
    }
}
