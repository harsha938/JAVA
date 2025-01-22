package OOPS.Final;

// final ===> method, variable, class
class A {
    final int age = 12;  // final variable cannot be changed once initialized

    final void show() {
        System.out.println("Hello");
    }
}

final class B extends A {
    // No need to redeclare 'age' here, use the one from class A
    // void show(){}  // Can't override the show() method because it's final in A
}

public class Demo {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();  // Will call the show() method from class A
        System.out.println(obj.age);  // Will print 12, as 'age' cannot be overridden in class B
    }
}
