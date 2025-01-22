package OOPS.Polymorphism.MethOverriding;

class NewCls{
  int add(int n1,int n2){
    return n1+n2;
  }
  int add(int n1,int n2,int n3){
    return n1+n2+n3;
  }
}
public class Demo {
  public static void main(String[] args) {
    NewCls n = new NewCls(); 
    System.out.println(n.add(1,2));
    System.out.println(n.add(31, 34, 34));
  }
}
