package factory;

public class MinusFactory extends AbstractFactory implements Operator {

    public MinusFactory(int a, int b) {
        super(a, b);
    }

    @Override
    public int result() {
        return super.a - super.b;
    }
}
