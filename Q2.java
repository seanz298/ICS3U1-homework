/**
Q2.java
	Description:Write a program that asks the user to enter a number. Use a while loop to keep asking for a new number until the user enters the number 10. When they enter 10, print "You got it!" and end the loop.
	Name: Sean
	Date Created: 2024/11/11
	Date last modified: 2024/11/11
*/
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int num;
      while (true){
      System.out.println("enter a number");
       num = scanner.nextInt();
        if (num == 10){
          System.out.println("you gor it");
          break;
        }
      }
    }
}