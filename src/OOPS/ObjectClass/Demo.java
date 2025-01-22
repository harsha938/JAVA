package OOPS.ObjectClass;

class Main{
  String name;
  int val;

  @Override
  public String toString() {
    return "Main [name=" + name + ", val=" + val + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + val;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Main other = (Main) obj;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    return val == other.val;
  }

  /* public boolean equals(Main that){
      return this.name.equals(that.name) && this.val==that.val;
  } */
}
public class Demo {
  public static void main(String[] args) {
    Main m = new Main();
    m.name = "harsha";
    m.val = 123;
    System.out.println(m);            //.toString() method automatically calls everytime when we print object name if  toString() available in the parent class then it executes it without going to the Object class.

    Main m2 = new Main();
    m2.name = "harsha";
    m2.val = 123;

    // boolean res= (m==m2);
    // boolean res1 = m.equals(m2);
    // System.out.println(res+" "+res1);
    boolean res = m.equals(m2);
    System.out.println(res);

    System.out.println(m.hashCode());
  }
}
