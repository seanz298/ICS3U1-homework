/**
Q5.java
	Description:Write a program that asks the user for their age. If they enter a number below 18, the program should print "Too young!" and ask again. Once they enter a number 18 or above, print "Old enough" and stop the loop.
	Name: Sean
	Date Created: 2024/11/11
	Date last modified: 2024/11/11
*/
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int age;
      while (true){
        System.out.print("enter your age");
        age = scanner.nextInt();
        if (age >=18){
          System.out.println("old enough");
        }
        else{
          System.out.println("too young");
          break;
        }
      }
      }
}