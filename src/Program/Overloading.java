package Program;

public class Overloading {

    public static void m1(int x) {
        System.out.println("Integer Value of X");
    }

    public static void m1(int x, double y) {
        System.out.println("Integer Value of X AND Double Value of Y");
    }

    public static void m1(double x, int y) {
        System.out.println("Integer Value of Y AND Double Value of X");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("MEMORY DESTROYED");
    }

    public static void main(String[] args) {

        m1(4);
        m1(4, 4.0);
        //m1(4.5, 4);

        String s1 = "java";
        String s4 = "java";
        String s2 = new String("java");
        String s3 = new String("java");

        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s1==s4);

        System.gc();



    }

}
