package observer;
import java.util.ArrayList;
import java.util.List;


public class News {
    private List<IReporter>  reporters = new ArrayList<>();

    public News(){

    }
    public void addReporter(IReporter reporter){
        reporters.add(reporter);
    }

    public void notify(String message){
        for (IReporter reporter: reporters) {
            reporter.report(message);
        }
    }

    public void removeReporter(IReporter reporter){
        this.reporters.remove(reporter);
    }

}
