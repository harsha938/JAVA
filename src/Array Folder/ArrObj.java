class Student{
  int rollno;
  String name;
  int age;
}
public class ArrObj {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.rollno = 197;
    s1.name = "Harsha";
    s1.age = 21;

    Student s2 = new Student();
    s2.rollno = 165;
    s2.name = "Varun";
    s2.age = 21;
    
    Student s3 = new Student();
    s3.rollno = 222;
    s3.name = "Ganesh";
    s3.age = 21;

    Student students[] = new Student[3];
    students[0] = s1;
    students[1] = s2;
    students[2] = s3;

      for (Student student : students) {
          System.out.println(student.name + " : " + student.age+" : "+student.rollno);
      }
  }
}
