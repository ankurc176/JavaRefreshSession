
public class Main {

    public static int x = 5;

    public static void main(String[] args) {
        int x = 10;
        System.out.print(x+" ");
        functionCall();
        System.out.print(x+" ");

    }

    public static void functionCall() {
        int x=15;
    }
}