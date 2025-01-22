package Threads;

class A extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("Hi");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

class B extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("Hello");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

public class Demo {
  public static void main(String[] args) {
    A obj1 = new A();
    B obj2 = new B();
    
    long startTime = System.currentTimeMillis(); // Time in milliseconds
    System.out.println("Priority of obj1: " + obj1.getPriority());
    obj2.setPriority(Thread.MAX_PRIORITY - 1);
    System.out.println("Priority of obj2: " + obj2.getPriority());
    
    obj1.start();
    obj2.start();
    
    try {
      obj1.join();  // Wait for thread obj1 to finish
      obj2.join();  // Wait for thread obj2 to finish
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    
    long endTime = System.currentTimeMillis();
    System.out.println("Time taken: " + (endTime - startTime) + " milliseconds");
  }
}
