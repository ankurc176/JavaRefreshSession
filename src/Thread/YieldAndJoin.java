package Thread;

public class YieldAndJoin extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i=0;i<1;i++) {
            System.out.println("SOUT");
        }
    }

    public static void main(String[] args) throws InterruptedException {

        YieldAndJoin t1 = new YieldAndJoin();
        YieldAndJoin t2 = new YieldAndJoin();
        YieldAndJoin t3 = new YieldAndJoin();

        t1.setPriority(MIN_PRIORITY);
        t2.setPriority(MAX_PRIORITY);
        t3.setPriority(MAX_PRIORITY);

        t1.yield();
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();

    }
}
