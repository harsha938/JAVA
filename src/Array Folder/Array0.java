import java.util.Scanner;

public class Array0 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);  
    int arr[][] = new int[2][2];
      for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
          arr[i][j] = s.nextInt();
        }
      }
      for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
          System.out.print(arr[i][j]+" ");
        }
        System.out.println();
      }
  }
}
