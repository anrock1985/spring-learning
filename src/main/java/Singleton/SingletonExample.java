package Singleton;

public class SingletonExample {
    private static SingletonExample instance = null;

    private SingletonExample() {
    }

    public SingletonExample getInstance() {
        if (instance == null) {
            synchronized (SingletonExample.class) {
                if (instance == null)
                    instance = new SingletonExample();
            }
        }
        return instance;
    }
}
