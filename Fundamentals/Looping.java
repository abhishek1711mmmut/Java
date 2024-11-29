import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
        System.out.println("Calculating the sum of 5 numbers");
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            sum += num;
        }
        System.out.println("THe sum is: " + sum);
    }
}
