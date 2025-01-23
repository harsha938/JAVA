package Collections.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
  int age;
  String name;

  public Student(int age, String name) {
    this.age = age;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Student [age=" + age + ", name=" + name + "]";
  }

  @Override
  public int compareTo(Student that) {
    if(this.age > that.age) return 1;
    else return -1;
  }
  
}
public class Demo1 {
  public static void main(String[] args) {
    @SuppressWarnings("unused")
    Comparator<Student> com = (Student a, Student b) -> {
        if(a.age > b.age) return 1;
        else return -1;
    };
    List<Student> studs = new ArrayList<>();
    studs.add(new Student(21, "Harsha"));
    studs.add(new Student(22,"Navin"));
    studs.add(new Student(24, "Reddy"));

    Collections.sort(studs);        //If we want to use the comparator then we can pass the comparator as the second argument like Collections.sort(studs, com);
    // System.out.println(studs);
    for(Student s: studs) {
      System.out.println(s);
    }
  }
}
