package chain_of_responsibility;

public  abstract class RequestChain {

    protected RequestChain nextChain;

    //设置下一个节点
    public abstract void setNextChain(RequestChain nextChain);

    public abstract boolean haveRight(int money);

    public abstract boolean handleFeeRequest(String name, int money);
//        if (this.haveRight(money)){
//            return this.handleFeeRequest(name,money);
//        }
//        if (this.nextChain.haveRight(money)){
//            return this.nextChain.handleFeeRequest(name ,money);
//        }
//        return false;

}
