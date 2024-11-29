interface A {
    default void display() {
        System.out.println("Inside display method");
    }
}

class Demo implements A {
    public void display() {
        System.out.println("Inside demo method");
    }
}

interface TestInterface {
    void display(String message);
}

public class TryC {

    public static void main(String[] args) {
        // A ref = new Demo();
        // ref.display();
        TestInterface obj=new TestInterface() {
            public void display(String message) {
                System.out.println(message);
            }
        };
        obj.display("Hello");
    }
}
