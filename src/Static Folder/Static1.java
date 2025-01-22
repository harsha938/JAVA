class Mobile{
  int cost;
  static String name = "SmartPhone";
  String brand;
  void show(){
    System.out.println(brand+" : "+cost+" : "+name);
  }
}
public class Static1 {
  public static void main(String[] args) {
    Mobile m1 = new Mobile();
    Mobile m2 = new Mobile();
    m1.cost = 1200;
    m1.brand = "iPhone";
    // m1.name = "Keypad";

    m2.cost = 1000;
    m2.brand = "Samsung";

    m1.show();
    m2.show();
  }
}
