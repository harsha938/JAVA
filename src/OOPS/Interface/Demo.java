package OOPS.Interface;


// Interface is a blueprint of a class
//Class->interface = implements
//interface->interface = extends
//class->class = extends
//interface can have only abstract methods and final variables.
interface A {
    
    int age = 21;         // By default public, static and final
    String name = "Harsha";        // By default public, static and final
    void show();

    void config();

    void display();
}
interface X{
  void show1();
}

class B implements A,X {

    @Override
    public void display() {
        System.out.println("Display method");
    }

    @Override
    public void show() {
        System.out.println("In Anonymous Inner Class");
    }

    @Override
    public void config() {
        System.out.println("Config method");
    }

    @Override
    public void show1() {
        System.out.println("Show1 method");
    }
}

public class Demo {

    public static void main(String[] args) {
        A obj = new B();
        // obj.name = "Harsha Vardhan";       // Cannot assign a value to final variable 'name'
        obj.show();
        obj.config();
        obj.display();
        X obj1 = new B();
        obj1.show1();
    }
}
