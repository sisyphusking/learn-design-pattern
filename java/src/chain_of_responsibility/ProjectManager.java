package chain_of_responsibility;

public class ProjectManager extends  RequestChain {


    @Override
    public boolean haveRight(int money) {
        return money < 500;
    }

    @Override
    public void setNextChain(RequestChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public boolean handleFeeRequest(String name, int money) {
        if (this.haveRight(money)) {
            if (name.equals("bob")){
                System.out.println("Project manager permit "+ name + " "+  money+ " fee request");
                return true;
            }
            return false;

        } else {
            System.out.println("Project manager don't permit "+ name + " "+  money+ " fee request");
            return  this.nextChain.handleFeeRequest(name, money);
        }
    }

}
