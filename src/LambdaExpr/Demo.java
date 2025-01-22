package LambdaExpr;

@FunctionalInterface
interface A{
  void show(int i);
}

//"->" represents the lambda operator
public class Demo {
  public static void main(String[] args) {
    // Lambda expressions are used to provide the implementation of a functional interface
    // They are used to provide a concise way to represent a method interface using an expression
    //Instead of writing the A obj = new A(){implementation of method}; we can write it as below
    A obj = i -> System.out.println("Hello "+i);
    obj.show(12);
  }
}
