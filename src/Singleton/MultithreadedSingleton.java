package Singleton;


import java.io.Serial;
import java.io.Serializable;

public class MultithreadedSingleton implements Serializable {

    private static String name;
    private static MultithreadedSingleton instance = null;

    private MultithreadedSingleton() {

    }

    public static MultithreadedSingleton getInstance() {

        if(instance == null) {

            synchronized (MultithreadedSingleton.class) {

                if (instance == null) {
                    instance = new MultithreadedSingleton();
                }
            }
        }
        return instance;
    }

    //This is a Key method to fix the Singleton Class by returning the same object while deserialization process
    @Serial
    protected Object readResolve(){
        return instance;
    }

    public static void main(String[] args) {

        MultithreadedSingleton ob1 = new MultithreadedSingleton();
        MultithreadedSingleton ob2 = new MultithreadedSingleton();

        System.out.println(ob1.getInstance().hashCode());
        System.out.println(ob2.getInstance().hashCode());

    }
}
