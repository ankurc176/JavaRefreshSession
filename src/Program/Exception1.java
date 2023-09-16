package Program;

public class Exception1 {

    public void m1() {
        int age = 30;
        try {
            if (age>=30) {
                throw new RuntimeException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        Exception1 ob = new Exception1();
        ob.m1();


    }

}
