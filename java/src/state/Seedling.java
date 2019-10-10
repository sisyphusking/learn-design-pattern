package state;

public class Seedling implements IState{

    @Override
    public void water() {
        System.out.println("the plant is growing");
    }

    @Override
    public void harvest() {
        System.out.println("the plant is just planted");
    }
}
