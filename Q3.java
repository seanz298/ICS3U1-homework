/**
Q3.java
	Description:  asks the user for their name and birth year. The program should calculate the user's age and print a personalized birthday message, 
	Name: Sean
	Date Created: 2024/11/1
	Date last modified: 2024/11/1
*/
import java.util.Scanner;
 public class Q3 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("enter the current year");
     int cy = scanner.nextInt();
     System.out.print("enter your name?");
     String name = scanner.nextLine();
     System.out.println("enter your birthyear");
     int birthyear = scanner.nextInt();
      int age = cy -birthyear;
      System.out.printf("Happy Birthday %s! You are now %d years old.%n", name, age);
    }
 }