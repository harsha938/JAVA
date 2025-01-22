package LambdaExpr;

//Lambda Expressions works only for Functional Interfaces
interface A{
  int add(int i,int j);
}
public class Demo1 {
  public static void main(String[] args) {
    A obj = (i,j) -> i+j;
    int res = obj.add(12, 5);
    System.out.println("Sum: "+res);
  }
}
