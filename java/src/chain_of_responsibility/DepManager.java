package chain_of_responsibility;

public class DepManager extends RequestChain {


    @Override
    public void setNextChain(RequestChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public boolean haveRight(int money) {
        return money< 5000;
    }

    @Override
    public boolean handleFeeRequest(String name, int money) {
        if (this.haveRight(money)){
            if (name.equals("tom")){
                System.out.println("Dep manager permit "+ name + " " + money+ " fee request");
                return true;
            }
            return false;

        } else{
            System.out.println("Dep manager don't permit "+ name + " " + money+ " fee request");
            return  this.nextChain.handleFeeRequest(name,money);
        }
    }

}
