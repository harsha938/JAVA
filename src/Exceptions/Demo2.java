package Exceptions;

//Throws keyword is used to declare an exception. It gives an information to the programmer that there may occur an exception so it is better for the programmer to provide the exception handling code so that normal flow can be maintained.
class A {

    public void show() throws ClassNotFoundException {
        Class.forName("Test");
    }
}

public class Demo2 {

//If throws used in main then it will ask the JVM to handle the exception.
    public static void main(String[] args) {
        A obj = new A();
        try {
          obj.show();
        } catch (ClassNotFoundException e) {
          System.out.println("Exception handled");
        }
    }
}
