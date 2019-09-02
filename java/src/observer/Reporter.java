package observer;

public class Reporter implements IReporter {
    private String name;

    public Reporter(String name){
        this.name = name;
    }

    @Override
    public void report(String event) {
        System.out.println(this.name + "report this event: "+ event);
    }
}
