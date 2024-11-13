/**
Q6.java
	Description:Write a do-while loop that asks the user to enter a password. The correct password is "JavaFun". Keep asking for the password until it is entered correctly, then print "Access Granted."
	Name: Sean
	Date Created: 2024/11/11
	Date last modified: 2024/11/11
*/
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String cpw = "JavaFun";
      String pw;
      do {
        System.out.println("enter password");
        pw = scanner.nextLine();
      }while(!pw.equals(cpw));
      System.out.println("Access Granted");
    }
}