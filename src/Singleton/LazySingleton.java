package Singleton;

public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton() {

    }

    LazySingleton getInstance() {

        if(instance == null) {
            instance=new LazySingleton();
        }
        return instance;

    }

    public static void main(String[] args) {

        LazySingleton ob1 = new LazySingleton();
        LazySingleton ob2 = new LazySingleton();

        System.out.println(ob1.hashCode());
        System.out.println(ob2.hashCode());
    }

}
