package strategy;

public class CashPay implements PayStrategy {

    private int money;
    private String name;

    public CashPay(String name, int money) {
        this.money = money;
        this.name = name;

    }

    @Override
    public void pay() {
        System.out.println(String.format("Pay $%d to %s by cash", this.money, this.name));
    }
}
