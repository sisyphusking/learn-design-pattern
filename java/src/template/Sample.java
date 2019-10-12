package template;

public class Sample  extends  AbstractTemplate implements  Downloader {

    public String uri;

    @Override
    public void Download(String uri) {
        this.uri =uri;
        System.out.println("prepare downloading");
        this.download();
        this.save();
        System.out.println("finish downloading");
    }

    @Override
    public void download() {
    }

    @Override
    public void save() {
        System.out.println("default save");
    }
}
