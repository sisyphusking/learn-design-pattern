package prototype;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        HonorGuard m = new HonorGuard(18, 180, 72, "m", "temp");
        HonorGuard zhangsan = (HonorGuard) m.clone();
        zhangsan.setName("zhangsan");
        System.out.println(zhangsan);

        HonorGuard lisi = (HonorGuard) m.clone();
        lisi.setName("lisi");
        System.out.println(lisi);
        System.out.println(m);
    }


}
