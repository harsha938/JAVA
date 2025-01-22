package OOPS.MethodOverriding;

class A {
  public int add(int n1,int n2){
    return n1+n2;
  }
}
class B extends A{
  public int add(int n1,int n2){
    return n1+n2+1;
  }
}
public class Demo{
  public static void main(String[] args) {
    B b = new B();
    int res = b.add(2,3);
    System.out.println(res);
  }
}