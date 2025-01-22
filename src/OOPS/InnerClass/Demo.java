package OOPS.InnerClass;

class Outer{
    public void show(){
        System.out.println("In show");
    }
    class Inner{
        public void display(){
            System.out.println("In Inner");
        }
    }
}
public class Demo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.show();
        Outer.Inner inner = outer.new Inner();
        //If the inner class is static then Outer.Inner inner = new Outer.Inner();
        inner.display();
    }
}
