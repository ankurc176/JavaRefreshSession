package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionPropogation {

    static void m1() throws FileNotFoundException {

        FileReader fileReader = new FileReader("Object.txt");
        int a=9, b=0;
        int c = a/b;

    }
    static void m2() throws FileNotFoundException {
        m1();
    }
    static void m3() throws FileNotFoundException {
        try {
            m2();
        } catch (Exception e) {
            System.out.println("FILE NOT FOUND");
        }

    }

    public static void main(String[] args) throws FileNotFoundException {
        m3();

    }

}
