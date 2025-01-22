package Enums;

enum Status{
  APPROVED, REJECTED, PENDING, RUNNING;           //These are constants
}
public class Demo {
  public static void main(String[] args) {
    
    Status s = Status.APPROVED;
    System.out.println(s);
    
    Status s1 = Status.PENDING;
    System.out.println(s1);               //Print the enum of s1

    System.out.println(s1.ordinal());     //Get the index of the enum
    
    Status[] s2 = Status.values();        //Get all the values of the enum into an array
    
    for(Status st : s2){                  //Iterating through the array
      System.out.println(st+" : "+(st.ordinal()+1));        //Print the enum and its index
    }

    System.out.println(s2.getClass().getSuperclass());        //Get the superclass of the array
    Status s3 = Status.PENDING;
      switch (s3) {
          case PENDING -> System.out.println("Please wait");
          case APPROVED -> System.out.println("Done Successfully");
          case REJECTED -> System.out.println("Failed");
          default -> System.out.println("Invalid");
      }
      /* 
       switch (s3) {
          case PENDING:
            System.out.println("Please wait");
            break;
          case APPROVED:
            System.out.println("Done Successfully");
            break;
          case REJECTED:
            System.out.println("Failed");
            break;
          default:
            System.out.println("Invalid");
            break;
      }
       */
  }
}
