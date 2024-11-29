// package JavanewFeatures;
// import java.util.function.*;

// it ensures that to get same result on any platform while performing operations on floating point numbers

// strictfp keyword is called as modifier and it can be used with classes, interfaces and methods only.

// if the class or interface prefixed with strictfp keyword then all methods of class or interface are implicitly strictfp methods only.

public class StrictFPKeyword {
    public static void main(String[] args) {
        float a = 1.0f;
        float b = 2.0f;
        float c = a / b;
        System.out.println(c);
        // Supplier<String> s = () -> "Hello";
        // String x=s.get();
        // System.out.println(s.get());
        // System.out.println(x);
    }
}
