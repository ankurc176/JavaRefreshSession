package Singleton;

import java.io.*;

public class SerializableSingletonEx {

    static void serializableMethod() {

        try {

            MultithreadedSingleton obj = MultithreadedSingleton.getInstance();
            FileOutputStream outputStream = new FileOutputStream("OutPut.txt");
            ObjectOutputStream out = new ObjectOutputStream(outputStream);
            out.writeObject(obj);
            out.close();

            FileInputStream inputStream = new FileInputStream("OutPut.txt");
            ObjectInputStream in = new ObjectInputStream(inputStream);
            MultithreadedSingleton obj1 = (MultithreadedSingleton) in.readObject();
            in.close();

            System.out.println("Instance of Serializable " + obj.hashCode());
            System.out.println("Instance of DeSerializable " + obj1.hashCode());

        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        serializableMethod();

    }
}
