package FinalDemo;

class Test {

    final void meth1() {
        System.out.println("meth 1");
    }

}

public class FinalClass extends Test {

//    void meth1() {
//
//    }
    
    final static int a;

    static
    {
        a=1;
    }

    public static void main(String[] args) {
        System.out.println(a);
    }

}
