package Collections.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
  public static void main(String[] args) {
    Comparator<Integer> comp = new Comparator<Integer>() {
      @Override
      public int compare(Integer a, Integer b) {
        if(a > b) return 1;
        else return -1;
      }
    };

    List<Integer> nums = new ArrayList<>();
    nums.add(1);
    nums.add(3);
    nums.add(2);
    nums.add(4);
    nums.add(5);

    Collections.sort(nums, comp);
    // Collections.sort(nums);
    System.out.println(nums);
  }
}