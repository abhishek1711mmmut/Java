import java.io.*;

class FileWriting{
public static void main(String args[]){
try{
FileInputStream fis=new FileInputStream(args[0]);
int size=fis.available();
byte b[]=new byte[size];
fis.read(b);
FileOutputStream fos=new FileOutputStream(args[1]);
fos.write(b);
System.out.println("success...");
fos.close();
fis.close();
}catch(Exception e){
	System.out.println("Error occured");
}
}
}	