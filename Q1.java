/**
Q1.java
	Description:  a program using .equals()  that will decide whether Alex is in a good or bad mood. 
	Name: Sean
	Date Created: 2024/11/5
	Date last modified: 2024/11/5
*/
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("What color does alex use");
    String color = scanner.nextLine();
      if (color.equals("red")){
      System.out.println("Alex is in a bad mood. ");
      }
      else{
      System.out.println("Alex is in a good mood. ");
             }
    }
}