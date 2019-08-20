package singleton;

public class Singleton {
    private volatile static Singleton singleton;

    private Singleton() {
    }

    //采用双锁机制，安全且在多线程情况下能保持高性能
    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }

        return singleton;
    }


}
