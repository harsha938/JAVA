package OOPS.InnerClass.AnonymousInnerClass;

abstract class A{
  abstract public void show();
  abstract public void config();
}
//We can use Anonymous Inner class for abstract class as well.
public class Demo {
  public static void main(String[] args) {
    A obj = new A(){
      @Override
      public void show(){
        System.out.println("In Anonymous Inner Class");
      }
      @Override
      public void config(){
        System.out.println("Config method");
      }
    }; // Anonymous Inner Class
    obj.show();
    obj.config();
  }
}
