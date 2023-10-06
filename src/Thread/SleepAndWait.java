package Thread;

import Program.StreamInterview;

class Student {

    public synchronized void m1(String value) throws InterruptedException {
        notify();
        System.out.println(value+ " Calling");
        wait();
        System.out.println("RESUMED");
    }
}

class MyThread extends Thread {

    Student ref;

    MyThread(Student ref) {
        this.ref=ref;
    }

    @Override
    public void run() {
        try {
            ref.m1("MY THREAD CLASS");
            System.out.println(Thread.currentThread().getName()+ " FIRST THREAD SLEEPING FOR 5 Seconds");
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName()+ " FIRST THREAD SLEEPING DONE NOTIFY NOW");
            System.out.println(Thread.currentThread().getName()+ " FIRST THREAD CALLING NOTIFY");
            notify();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

class SecondThread extends Thread {

    Student student;

    SecondThread(Student student) {
        this.student = student;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName()+ "  SECOND THREAD SLEEPING FOR 10 SECONDS");
            Thread.sleep(10000);
            System.out.println(Thread.currentThread().getName()+ " SECOND THREAD SLEEPING DONE");
            student.m1("SECOND THREAD CLASS");
            System.out.println(Thread.currentThread().getName()+ "  SECOND THREAD CALLING NOTIFY");
            notify();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class SleepAndWait {

    public static void main(String[] args) {

        Student student = new Student();

        MyThread myThread = new MyThread(student);
        myThread.start();

        SecondThread secondThread = new SecondThread(student);
        secondThread.start();


    }

}
