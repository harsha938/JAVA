package Enums;

enum Laptop{
  DELL(1000), HP(2000), MAC, LENOVO(4000);
  private int price;

  private Laptop(){
    price = 1999;
  }

  private Laptop(int price) {
    this.price = price;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
  
}
public class Demo1 {
  public static void main(String[] args) {
    for(Laptop l : Laptop.values()){
      System.out.println("Name: "+l+" Price: "+l.getPrice());
    }
  }
}