package builder;

public class Builder {

    private Style style;

    public Builder(Style style) {
        this.style = style;
    }

    public void build() {
        System.out.println(this.style.roof() + "," + this.style.gate());
    }

}
