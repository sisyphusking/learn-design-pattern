package strategy;

public class Test {

    public static void main(String[] args) {

        Context context;
        context = new Context(new BankPay("xavier", 666));
        context.pay();

        context = new Context(new CashPay("xingwei", 888));
        context.pay();

    }
}
