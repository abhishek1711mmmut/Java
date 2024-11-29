public class ChartoString{
public static void main(String args[]){
// byte []a={97,98,99,100,104};
// String s=new String(a);
// System.out.println(s);

String s="abcde";
byte b[]=s.getBytes();
System.out.println(b);
for(byte a:b) System.out.println(a);
}
}