import java.util.StringTokenizer;  
public class StringTokenizerDemo{  
 public static void main(String args[]){  
	String s="Welcome to Java";
   StringTokenizer st = new StringTokenizer(s); 
System.out.println("st"+st); 
     while(st.hasMoreTokens()) {  
         System.out.println(st.nextToken());  
     }  
   }  
}  