package strategy;

public class Context {
    PayStrategy payStrategy;

    public Context(PayStrategy strategy) {
        this.payStrategy = strategy;
    }

    //调用实现方的pay接口
    public void pay() {
        this.payStrategy.pay();
    }

}
