public class Str2 {
  public static void main(String[] args) {
    StringBuffer str = new StringBuffer("harsha");
    // System.out.println(str.capacity());
    str.append(" Vardhan");
    System.out.println(str);

    //Converting the stringbuffer to string
    String str1 = str.toString();
    // System.out.println(str1);

    str.deleteCharAt(2);
    System.out.println(str);

    str.insert(0, " Bhaskara");
    // System.out.println(str);

    str.setLength(12);
    // System.out.println(str);

    str.setCharAt(1, 'r');
    System.out.println(str);

  }
}
