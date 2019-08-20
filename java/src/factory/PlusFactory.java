package factory;

public class PlusFactory extends AbstractFactory implements Operator {

    public PlusFactory(int a, int b) {
        super(a, b);
    }

    @Override
    public int result() {
        return super.a + super.b;
    }
}
