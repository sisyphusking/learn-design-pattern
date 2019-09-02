package observer;


public class Test {

    public static void main(String[] args) {
        News news = new News();
        Reporter zhangsan = new Reporter("zhangsan");
        news.addReporter(zhangsan);

        Reporter lisi = new Reporter("lisi");
        news.addReporter(lisi);

        news.notify("something A has happened");

        news.removeReporter(lisi);
        news.notify("something B has happened");


    }
}
