package pattern.factory;

public class Test {

    public static void main(String[] args) {
        System.out.println("factory method ");

        Operator operator;

        operator = new PlusFactory(2, 3);
        System.out.println("plus factory method result: " + operator.result());

        operator = new MinusFactory(4, 2);
        System.out.println("minus factory method result: " + operator.result());

    }
}
