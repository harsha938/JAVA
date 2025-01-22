package OOPS.Polymorphism.MethOverriding;

class A{
  void meth(){
    System.out.println("In A Class");
  }
}
class B extends A{
  void meth(){
    System.out.println("In B class");
  }
}
class C{
  void meth(){
    System.out.println("In C Class");
  }
}
public class Demo1 {
  public static void main(String[] args) {
    A obj = new A();
    obj.meth();

    obj = new B();
    obj.meth();

    // obj = new C();      //We'll get error as C not extended from any of the superclass where the obj is created
  }
}
