package OOPS.Interface;

interface Computer{
  void code();
}
class Desktop implements Computer{
  @SuppressWarnings("override")
  public void code(){
    System.out.println("Coding");
  }
}
class Laptop implements Computer{
  @SuppressWarnings("override")
  public void code(){
    System.out.println("Coding");
  }
}
class Developer{
  void devApp(Computer comp) {
    comp.code();
  }
}
public class Need {
  public static void main(String[] args) {
    Computer l = new Laptop();
    @SuppressWarnings("unused")
    Computer desk = new Desktop();
    Developer d = new Developer();
    d.devApp(l);
  }
}
