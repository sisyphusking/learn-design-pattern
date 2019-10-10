package state;

public class Test {

    public static void main(String[] args) {
        Fruit fruit = new Fruit(new Seedling());
        fruit.harvest();
        fruit.water();
        fruit.harvest();
        fruit.water();
        fruit.water();
        fruit.harvest();
    }

}
