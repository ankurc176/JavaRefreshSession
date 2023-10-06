package Program;

public class InnerOuter {

    class Inner {

        public static void m1() {
            System.out.println("M1 of Inner Class");
        }
    }

    public void m2() {
        System.out.println("M2 of Outer Class");
    }

    public static void main(String[] args) {

        InnerOuter outer = new InnerOuter();
//        InnerOuter.Inner inner = outer.new Inner();

        Inner.m1();
        outer.m2();

    }

}
