package strategy;

public class BankPay implements PayStrategy {

    private int money;
    private String name;

    public BankPay(String name, int money) {
        this.money = money;
        this.name = name;

    }

    @Override
    public void pay() {
        System.out.println(String.format("Pay $%d to %s by bank", this.money, this.name));
    }
}
