class A{
void show(String s){
System.out.println(s);
}
}

class B{
static A a=new A();
}

class TempLearn{
public static void main(String args[]){
B.a.show("Hii");
}
}