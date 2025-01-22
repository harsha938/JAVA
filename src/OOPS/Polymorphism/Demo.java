package OOPS.Polymorphism;

class Human{
  private int age;
  private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age,Human h) {
        // this.age = age;     //Instead of this we can use object to set a value to the variable. And this represents the current object. 
        h.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
  
}
public class Demo {
  public static void main(String[] args) {
    Human h = new Human();
    h.setAge(22,h);
    h.setName("Harsha Vardhan");
    System.out.println(h.getAge()+ " "+h.getName());
  }
}
