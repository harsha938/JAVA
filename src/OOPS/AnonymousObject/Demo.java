package OOPS.AnonymousObject;
class NewClass{
  public NewClass() {
    System.out.println("New Object Created");
  }
  public void show(){
    System.out.println("In Show");
  }
}
public class Demo {
  public static void main(String[] args) {
    // new NewClass();             //Anonymous Object
    new NewClass().show();          //Everytime we need to create using new as reference is not there for a class
  }
}
