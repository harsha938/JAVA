package Exceptions;

class CustomException extends Exception{
  CustomException(String s){
    super(s);
  }
}
public class Demo1 {
  public static void main(String[] args) {
    int i = 0 ;
    int j = 0;
    try{
/*       if(i==0){
        throw new ArithmeticException("Divide by zero");
      }
      j = 19 / i; */
      if(i==0){
        System.out.println(j);
        throw new CustomException("Divide by zero");
      }
    }
    catch(CustomException e){
      System.out.println("Exception: " + e);
    }
    catch(ArithmeticException e){
      j = 19 / 1;
      System.out.println(j);
      System.out.println("Exception: " + e);
    }
    finally{
      System.out.println("Finally block");
    }
  }
}
