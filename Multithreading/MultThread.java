// program to create two child threads and two main threads by extending java.lang.Thread class

package Multithreading;

class A extends Thread {
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

public class MultThread extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(getName() + ": " + i);
                if (getName().equals("Child Thread1"))
                    Thread.sleep(1000);
                else
                    Thread.sleep(3000);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void main(String[] args) {
        try {
            MultThread mt1 = new MultThread();
            mt1.setName("Child Thread1");
            mt1.start();
            MultThread mt2 = new MultThread();
            mt2.setName("Child Thread2");
            mt2.start();
            A a = new A();
            a.start();
            for (int i = 0; i < 10; i++) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
