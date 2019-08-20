package builder;

public class ItalianType implements Style {
    public ItalianType(){}

    @Override
    public String roof() {
        return "white round roof";
    }

    @Override
    public String gate() {
        return "white gate";
    }
}
