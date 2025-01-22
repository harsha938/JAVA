package Input;

// import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Demo {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws IOException {
        /*System.out.println("Hello");
        int num = System.in.read();               //num stores the ascii values of the input. Works only for single digits*/
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(in);
        // int num = Integer.parseInt(br.readLine());
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
        sc.close();

    }
}
