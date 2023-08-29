package Exception;

public class TryResourcesExample {

    public static void main(String[] args) {

        int a=10, b=0, c;

        try {
            c = a / b;
        } finally {
            System.out.println("Test");
        }
    }
}
