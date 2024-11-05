/**
Q10.java
	Description: The program will then separate the first two digits, and put them into a new variable. Then it’ll take the latter two digits, and put it into another new variable. 
	Name: Sean
	Date Created: 2024/10/16
	Date last modified: 2024/10/16
*/
import java.util.Scanner;
 public class Q10 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
      System.out.println("please give me a number between 1000 to 9999");
      int number = scanner.nextInt();
      int f2 = (number / 100);// Getting the first two digits
      int l2 = (number % 100); // Getting the last two digits
           System.out.println(f2);
           System.out.println(l2);
    }
 }