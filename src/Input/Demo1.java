package Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Instead of closing the BufferedReader in finally block, we can use try-with-resources
class Demo{
  public static void main(String[] args) throws NumberFormatException, IOException {
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      int num = Integer.parseInt(br.readLine());
      System.out.println(num);
    }
  }
}