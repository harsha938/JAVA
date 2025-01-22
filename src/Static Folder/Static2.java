class Mobile {
  int cost;
  String brand;
  static String name;

  // Mobile() {
  //     cost = 1200;
  //     brand = "iPhone";
  //     System.out.println(cost + " : " + brand + " : " + name);
  // }

  static {
      name = "SmartPhone";
      System.out.println("In static");
  }

  static void show(Mobile obj){
    System.out.println(obj.brand+" : "+obj.cost+" : "+name);
  }
}

public class Static2 {
  public static void main(String[] args) {
      try {
          Class.forName("Mobile"); // Load the Mobile class
      } catch (ClassNotFoundException e) {
          // Handle the exception
      }
      Mobile m1 = new Mobile();
      m1.brand="iPhone";
      m1.cost = 1200;
      Mobile.show(m1);
  }
}
