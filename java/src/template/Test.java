package template;

public class Test {

    public static void main(String[] args) {
        Sample s = new HTTPDownloader();
        s.Download("http://example.com/abc.zip");

        System.out.println("-------");

        Sample s1 = new FTPDownloader();
        s1.Download("ftp://example.com/abc.zip");

    }

}
