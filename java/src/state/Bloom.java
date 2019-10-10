package state;

public class Bloom implements IState  {
    @Override
    public void water() {
        System.out.println("the plant is ripping");
    }

    @Override
    public void harvest() {
        System.out.println("the plant is blooming, don't do that!");
    }
}
