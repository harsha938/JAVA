package Annotations;

//Annotations are used to provide metadata for Java code. They do not change the actions of a compiled program.
// @Deprecated -> This annotation indicates that the marked element is deprecated and should no longer be used
// @FunctionalInterface -> This allows the interface to have only one abstract method
class A{
  public void thisMethodBelongsToTheClass(){
    System.out.println("This method belongs to the class A");
  }
}
class B extends  A{
  @Override     // This annotation indicates that the marked element is meant to override a method
  public void thisMethodBelongsToTheClass(){
    System.out.println("This method belongs to the class B");
  }
}
public class Demo {
  public static void main(String[] args) {
    B b = new B();
    b.thisMethodBelongsToTheClass();
  }
}
