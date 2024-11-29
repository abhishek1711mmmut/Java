// program to create two child threads and two main threads by implementing java.lang.Runnable interface

package Multithreading;

class DemoRunnable2 implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Another Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}

public class DemoRunnable implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Core Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void main(String[] args) {
        Runnable r = new DemoRunnable();
        Thread t = new Thread(r);
        t.start();
        Runnable r1 = new DemoRunnable2();
        Thread t1 = new Thread(r1);
        t1.start();
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
