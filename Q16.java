/**
Q16.java
	Description: determines whether it is even or odd using the modulo operator.
	Name: Sean
	Date Created: 2024/10/17
	Date last modified: 2024/10/17
*/
import java.util.Scanner;
 public class Q16 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("please give me a number");
      int nm = scanner.nextInt();
      int nm2 = 2;
      int nm1 = (nm % nm2);
      System.out.println("if the folloing number is 0 it is an even,  if not is an odd");
      System.out.println(nm1);
    }
 }