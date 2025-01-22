package OOPS.Constructor;

class Human{
  int age;
  String name;
  Human(){
    this.age = 12;
    this.name = "Harsha";
  }
  Human(String name){
    this.age = 15;
    this.name = name;
  }
  Human(int age,String name){
    this.age = age;
    this.name = name;
  }
  public void show(){
    System.out.println(name+" : "+age);
  }
}
public class Demo {
  public static void main(String[] args) {
    Human h = new Human();
    Human h1 = new Human(21,"Harsha");
    Human h2 = new Human("Vardhan");
    h.show();
    h1.show();
    h2.show();
  }
}
