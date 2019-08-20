package singleton;

import singleton.Singleton;

public class Test {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        if (s1.equals(s2)) {
            System.out.println("instance1 equal to instance2");
        }

    }
}
