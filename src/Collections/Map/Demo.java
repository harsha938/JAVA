package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class Demo {
  public static void main(String[] args) {
    Map<String,Integer> students = new HashMap<>();
    students.put("Harsha", 197);
    students.put("Ravi", 198);
    students.put("Kiran", 199);
    students.put("David", 200);
    students.put("Ravi", 201);
    System.out.println(students.get("Harsha"));
    System.out.println(students);
    System.out.println(students.keySet());

    for(String key: students.keySet()) {
      System.out.println(key + " : " + students.get(key));
    }
  }
}
