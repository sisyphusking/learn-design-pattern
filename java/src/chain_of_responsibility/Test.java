package chain_of_responsibility;

public class Test {

    public static void main(String[] args) {


        ProjectManager bob = new ProjectManager();
        DepManager tom = new DepManager();
        GeneralManager ada = new GeneralManager();
        bob.setNextChain(tom);
        tom.setNextChain(ada);

        RequestChain requestChain = bob;
        requestChain.handleFeeRequest("bob", 400);
        requestChain.handleFeeRequest("tom", 1400);
        requestChain.handleFeeRequest("ada", 10000);
        requestChain.handleFeeRequest("test", 400);

        //output:
        //Project manager permit bob 400 fee request
        //Project manager don't permit tom 1400 fee request
        //Dep manager permit tom 1400 fee request
        //Project manager don't permit ada 10000 fee request
        //Dep manager don't permit ada 10000 fee request
        //General manager permit ada 10000 fee request
    }
}
