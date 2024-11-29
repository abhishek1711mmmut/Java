public class ExceptionOne {
public static void main(String args[]){
try{
int x=Integer.parseInt(args[0]);
int y=Integer.parseInt(args[1]);
System.out.println(x/y);
}catch(Exception ae){
System.out.println("Please enter only 2 numbers");
}
}
} 