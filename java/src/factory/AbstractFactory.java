package factory;

public abstract class AbstractFactory {

    public int a;
    public int b;

    public AbstractFactory(int a, int b) {
        this.setA(a);
        this.setB(b);
    }


    public void setA(int a) {
        this.a = a;
    }

    public void setB(int a) {
        this.b = a;
    }

}
