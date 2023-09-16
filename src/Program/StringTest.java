package Program;

import java.util.HashMap;
import java.util.NoSuchElementException;


class Parent {

    static void m1() {
        System.out.println("Parent Method");
    }
}

class Child extends Parent {

    static void m1() {
        System.out.println("Child Method");
    }

}

class MyDemo {

    @Override
    public int hashCode() {
        System.out.println("HashCode Method is Called......");
        return super.hashCode();
    }
}

public class StringTest {

    public static void main(String[] args) {

        Parent p = new Parent();
        p.m1();
        Child c = new Child();
        c.m1();
        Parent c1 = new Child();
        c1.m1();
        Child.m1();

//        String str = "Himmat"; //Create in String Constant Pool
//        String str1 = "Himmat"; //Create in String Constant Pool
//        String str2 = str.concat("Himmat");
//        String str3 = new String("Himmat").intern(); //Heap Memory
//
//        System.out.println(str3 == str);
//        System.out.println("STR OBJ "+str.hashCode()+"\n ST



        HashMap<String, Integer> hashMap = new HashMap<>();
        //MyDemo myDemo = new MyDemo();

        hashMap.put("myDemo", 1);
        hashMap.get("myDemo");


    }
}
