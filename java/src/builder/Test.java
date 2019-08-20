package builder;

public class Test {

    public static void main(String[] args) {

        Builder builder = new Builder(new ChineseType());
        builder.build();

        Builder builder1 = new Builder(new ItalianType());
        builder1.build();
    }
}
