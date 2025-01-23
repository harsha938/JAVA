package Collections.Sets;

import java.util.HashSet;
import java.util.Set;

public class Demo {
  public static void main(String[] args) {
    Set<Integer> set = new HashSet<Integer>();
    set.add(10);
    set.add(20);
    set.add(30);
    set.add(10);
    set.add(20);

    set.remove(20);
    System.out.println(set.contains(20));

    System.out.println(set.isEmpty());

    System.out.println(set.size());
    for(int n:set){
      System.out.println(n);
    }
  }
}
