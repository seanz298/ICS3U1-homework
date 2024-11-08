/**
Q2.java
	Description:  . Write a program that asks the user how many pairs of blue jeans they own
	Name: Sean
	Date Created: 2024/11/5
	Date last modified: 2024/11/5
*/
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
      System.out.println("how many pairs of blue jeans do you own?");
      int jeans = scanner.nextInt();
      if (jeans != 0) {
        System.out.println("You have a fashionable wardrobe!");  
      }
      else {
        System.out.println("According to Monika, you need at least one pair of blue jeans!");  
      }
    }
}