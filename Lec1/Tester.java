// class Intro{
//     static int age;
//     public static void main(String arguments[]){
//         int x=5;
//         int y=5;
//         // int y=(int)x;
//         System.out.println("Hello World!");
//         System.out.println(x==y);
//     }
// }

// class TechVersentThread extends Thread{
//     public static void main(String arguments[]) throws Exception{
//         Thread.sleep(5000);
//         System.out.println("Accenture");
//     }
// }

// class TechVersentThread extends Thread{
//     public void run(){
//         System.out.println("Accenture");
//     }
//     public static void main(String arguments[]) throws InterruptedException{
//         Runnable r=new TechVersentThread();
//         Thread myThread=new Thread(r);
//         myThread.start();
//     }
// }

// class Hotel{
//     public int bookings;
//     public void book(){
//         bookings++;
//     }
// }
// class SuperHotel extends Hotel{
//     public void book(){
//         bookings--;
//     }
//     public void book(int size){
//         book();
//         bookings+=size;
//     }
// }

// public class TestHotel{
//     public static void main(String arguments[]){
//         Hotel h=new Hotel();
//         h.book();
//         System.out.println(h.bookings);
//     }
// }

// public class Print{
//     public static void main(String arguments[]){
//         try{
//             System.out.println("Hello World!"+" "+  1/0);
//         }
//         catch(ArithmeticException e){
//             System.out.println("Standard Exception");
//         }
//     }
// }

// public class Tester{
//     int x=10;
//     static
//     {
//         int x=20;
//         System.out.println(x);  
//     }
//     public static void main(String arguments[]){
//         Tester t=new Tester();
//         System.out.println(t.x);
//     }
// }


// class Sample{
//     public void m1(int a, float b){
//         System.out.println("Inside m1 method");
//     }
//     public void m1(float b, float a){
//         System.out.println("Inside m1 overload method");
//     }
// }

class Example{
    public static void main(String arguments[]){
        String name="computer";
        StringBuffer sb=new StringBuffer(name);
        StringBuffer sb1=new StringBuffer();
        String name1=sb.reverse().toString();
        char c[]=name1.toCharArray();
        for(int i=0;i<c.length;i++){
            sb1.append(c[i]);
            sb1.append("-");
        }
        System.out.println(sb1.substring(0, sb1.length()-1));
    }
}