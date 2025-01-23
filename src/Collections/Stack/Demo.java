package Collections.Stack;

import java.util.Stack;

public class Demo {
  public static void main(String[] args){
    Stack<Integer> stack = new Stack<>();
    stack.push(12);
    stack.push(23);
    stack.push(34);
    stack.push(45);
    stack.pop();
    int top = stack.peek();
    System.out.println("Top: "+top);
    int size = stack.size();
    System.out.println("Size: "+size);
  }
}
