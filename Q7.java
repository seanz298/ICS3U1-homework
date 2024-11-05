/**
Q7.java
	Description: add two input number toghter
	Name: Sean
	Date Created: 2024/10/16
	Date last modified: 2024/10/16
*/
import java.util.Scanner;
 public class Q7 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("please give me a number");
    int nm1 = scanner.nextInt(); 
    System.out.println("please give me another number");
    int nm2 = scanner.nextInt(); 
    int total = (nm1 + nm2);
    System.out.println("The sum of the two number is " + total);
   }
}