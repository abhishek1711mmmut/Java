// package JavanewFeatures;

// It means variable arguments
// VarArgs must be the last argument in the method signature else compile time error will occur

public class VArArgsDemo {
    void print(int a, int b, int... args) {
        System.out.println(a + " " + b + " " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

    public static void main(String[] args) {
        VArArgsDemo v = new VArArgsDemo();
        v.print(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }
}

// javap: used to get the profile of a class or interface
// eg: javap java.lang.String
// it shows the list of variables, methods, and constructors in that class