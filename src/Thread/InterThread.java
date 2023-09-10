package Thread;

class MyData {

    int value;

    boolean flagT=true;

    //Will be used by Producer

    synchronized public void setValue(int value) throws InterruptedException {

        while(flagT!=true){
            wait();
        }
        this.value=value;
        flagT=false;
        notify();
    }

    //Will be used by Consumer
    synchronized public int getValue() throws InterruptedException {

        while(flagT!=false){
            wait();
        }
        flagT=true;
        notify();
        return value;

    }

}

class Producer extends Thread {

    MyData ref;

    Producer(MyData ref) {
        this.ref=ref;
    }

    int count=1;
    @Override
    public void run() {
        while(true) {
            try {
                ref.setValue(count);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("PRODUCER "+ count);
            count++;
        }
    }
}

class Consumer extends Thread {

    MyData ref;

    Consumer(MyData ref) {
        this.ref = ref;
    }

    @Override
    public void run() {
        while (true) {
            int value = 0;
            try {
                value = ref.getValue();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("CONSUMER "+value);
        }
    }
}


public class InterThread {

    public static void main(String[] args) throws InterruptedException {

        MyData myData = new MyData();

        Producer producer = new Producer(myData);
        Consumer consumer = new Consumer(myData);

        producer.start();
        consumer.start();



    }
}
