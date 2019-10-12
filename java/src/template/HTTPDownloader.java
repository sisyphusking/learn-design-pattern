package template;

public class HTTPDownloader extends Sample {

    public void download() {
        System.out.printf("download %s vis http\n", super.uri);
    }

    public void save() {
        System.out.println("http save");
    }
}
