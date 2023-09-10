package Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionEx {

    public static void ReflectionExample() throws InvocationTargetException, InstantiationException, IllegalAccessException {

        Constructor[] constructors = MultithreadedSingleton.class.getDeclaredConstructors();
        Constructor constructor = constructors[0];

        constructor.setAccessible(true);

        MultithreadedSingleton obj = (MultithreadedSingleton) constructor.newInstance();
        MultithreadedSingleton obj2 = MultithreadedSingleton.getInstance();

        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());


    }

    public static void EnumEx() throws InvocationTargetException, InstantiationException, IllegalAccessException {

        Constructor[] constructors = EnumSingleton.class.getDeclaredConstructors();

        Constructor constructor = constructors[0];

        constructor.setAccessible(true);

        EnumSingleton instance = (EnumSingleton) constructor.newInstance();
        EnumSingleton instance2 = EnumSingleton.INSTANCE;

        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());

    }


    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {

      //  ReflectionExample();

        EnumEx();
    }
}
