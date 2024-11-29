package MCQ1;

interface I1{
    void display();
    int methodA(int x);
}

interface I2{
    int methodB(int x);
}

public class SuccessCompile extends Thread implements I1, I2 {

    public void display() {
        // System.out.println("Inside display method");
    }

    public int methodA(int x) {
        return x;
    }

    public int methodB(int x) {
        return x;
    }

    public static void main(String[] args) {
    }
}
