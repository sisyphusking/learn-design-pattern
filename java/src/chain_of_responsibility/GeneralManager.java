package chain_of_responsibility;

public class GeneralManager  extends  RequestChain {

    @Override
    public void setNextChain(RequestChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public boolean haveRight(int money) {
        return true;
    }

    @Override
    public boolean handleFeeRequest(String name, int money) {
        if (name.equals("ada")){
            System.out.println("General manager permit "+ name + " " +  money+ " fee request");
            return true;
        }
        System.out.println("General manager don't permit "+ name + " " +  money+ " fee request");
        return false;
    }

}
