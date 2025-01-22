package Exceptions;
//Errors: Errors are irrecoverable conditions that should not be caught or handled.
//Types of errors: Compile-time errors, Run-time errors, Logical errors. 
//Compile-time errors are those which prevent the code from running. Run-time errors are those which occur while the code is running. Logical errors are those which occur due to incorrect logic.
//Types of Exceptions: Checked and Unchecked
//Checked Exceptions are checked at compile time and Unchecked Exceptions are checked at runtime.
//Checked Exceptions are those which are checked at compile time. If some code within a method throws a checked exception, then the method must either handle the exception or it must specify the exception using throws keyword.
//Unchecked Exceptions are those which are not checked at compile time. It is up to the programmer to write the code in such a way so that these exceptions do not occur at runtime.
//Excpetion handling is a mechanism to handle runtime errors such as ClassNotFound, IOException, SQLException, RemoteException, etc.
public class Demo {
//ArithmeticException, ArrayIndexOutOfBoundsException, NullPointerException -> Exception is the parent class of all exceptions -> Throwable is the parent class of Exception class. -> Error is the parent class of Throwable class. -> Object is the parent class of Error class.
    @SuppressWarnings("null")
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        int[] arr = new int[5];
        String str = null;
        arr[0] = 1;
        try {
            System.out.println(str.length());
            j = i / j;
            System.out.println(j);
            System.out.println(arr[5]);
        } catch (NullPointerException e) {
            System.out.println("Exception: " + e);
            System.out.println("Exception: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(j);
            System.out.println("Exception: " + e);
            System.out.println("Exception: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e);
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e);
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block");
        }
    }
}
