package state;

public class maturity  implements IState{
    @Override
    public void water() {
        System.out.println("the plant don't need water!");
    }

    @Override
    public void harvest() {
        System.out.println("you got lots of fruits");
    }
}
