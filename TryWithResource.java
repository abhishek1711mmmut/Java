import java.io.*;

class TryWithResource{
public static void main(String args[]) throws Exception {
try(FileInputStream fis=new FileInputStream("Welcome.txt");){
byte b[]=new byte[fis.available()];
fis.read(b);
System.out.println(new String(b));
}
}
}