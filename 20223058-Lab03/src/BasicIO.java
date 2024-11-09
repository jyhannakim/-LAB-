import java.util.*;

// An exploration of basic input and output.
class BasicIO {

   // Reads and processes string input.
   public static void main(String[] args) {

      Scanner stdin = new Scanner(System.in);

      // get first input
      System.out.print("Enter your name: ");
      String name = stdin.nextLine();

     // get second input
      System.out.print("What is your age?: ");
      int years = stdin.nextInt();

     // get third input
      System.out.print("What is your height?: ");
      int height = stdin.nextInt();

     // get date input
     // int years = now.getYear();
      //int month = now.getMonth();
	
        

      // display output on console
      System.out.println("your name is " + name + ", and your age is  " + years);
      System.out.println("your age is " + years * 365 + " days");
      System.out.println("현재 " + name + "(" + years + ")" + " 의 키는 " + height + "cm 입니다.");
   }  // method main

}  // class BasicIO