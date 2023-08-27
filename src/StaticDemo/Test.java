package StaticDemo;

class My {

    static {
        System.out.println("My Block");
    }

}
public class Test {

    int a=10;
    static {
        System.out.println("Block 1");
    }

    public static void main(String[] args) {
        System.out.println("Main");
        //System.out.println(a);
        My ob = new My();
    }

    static {
        System.out.println("Block 2");
    }
}
