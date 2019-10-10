package state;


public class Fruit {
    private  IState state;

    public Fruit(IState state){
        this.state = state;
    }

    public void water(){
        this.state.water();
        if (state instanceof Seedling){
           Bloom bloom = new Bloom();
           this.state = bloom;
        } else{
            maturity maturity = new maturity();
            this.state = maturity;
        }
    }

    public void harvest(){
        this.state.harvest();
        if (state instanceof maturity){
            Seedling seedling = new Seedling();
            this.state = seedling;
        }
    }

}
