package Program;


public class FuncThread {

    public static void main(String[] args) {

        Runnable A = () -> {
            System.out.println("THREAD");
        };

        Thread thread = new Thread(A);
        thread.start();

    }

}
