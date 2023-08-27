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

        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        serializableMethod();

    }
}
