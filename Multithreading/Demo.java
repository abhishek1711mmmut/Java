// program to get current thread information

package Multithreading;

public class Demo {
    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        System.out.println(t.getState());
        t.setPriority(Thread.MAX_PRIORITY);
        // t.setPriority(Thread.MIN_PRIORITY);
        // t.setPriority(Thread.NORM_PRIORITY);
        System.out.println(t.getPriority());
    }
}
