package OOPS.Constructor;


//By default every constructor has super method in it to call the constructor of the super class
//Every class in JAVA by default extends the Object class
//this() executes the constructor of the same class
//super() executes the constructor of the super class
class A extends Object{
  public A(){
    super();                //This calls the constructor of the object class
    System.out.println("in A");
  }
  public A(int n){
    System.out.println(n+" in A");
  }
}
class B extends A{
  public B(){
    super(5);         //If we pass arg in super then it calls the constructor of the super class which has parameters in it.
    System.out.println("In B");
  }
  public B(int n){
    // super();              //Super calls the constructor of the super class. If we pass the arg in super() then it call the parameterized constructor of the super class;
    //super(n);                //If we pass arg then it call the parameterized constructor of the super class
    this();                     //If we use this() then it will call the previous constructor of the same class
    System.out.println(n+" in B");
  }
}
public class Demo1 {
  public static void main(String[] args) {
    B b = new B(5); 
    b.getClass();   //Sample one
  }
}
