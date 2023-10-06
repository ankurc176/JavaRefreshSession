package Program;

@FunctionalInterface
public interface FunctionalInterface1 {

    void show();

    default void show1() {
        System.out.println("TEst");
    }

    static void show2() {
        System.out.println("TEST");
    }

}
