package prototype;

public  class HonorGuard extends  GuardPrototype{

    private int age;
    private int height;
    private int weight;
    private String gender;
    private String  name;

    public HonorGuard(int age, int height, int weight, String gender, String name) {
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "HonorGuard{" +
                "age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
