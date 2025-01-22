package OOPS.AbstractKeyWord;

abstract class Car{
    abstract public void start();
    abstract public void fly();
    public void stop(){
        System.out.println("Car is stopping");
    }
}
//Abstract class can't have object, so we have to create object of child class
//It's not mandatory to have abstract methods in abstract class
//Here we don't want to implement fly() method in Audi class, so we have to define the class as abstract
abstract class Audi extends Car{
    @Override
    public void start(){
        System.out.println("Audi is starting");
    }
}
//Here we have to implement fly() method in AudiA4 class
class AudiA4 extends Audi{
    @Override
    public void fly(){
        System.out.println("AudiA4 is flying");
    }
}
public class Demo {
  public static void main(String[] args) {
    Car c = new AudiA4();
    c.start();
    c.stop();
    c.fly();
  }
}
