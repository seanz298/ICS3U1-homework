/**
Q4.java
	Description:Write a program that generates a "magic number" set to 7. Use a while loop to ask the user to guess the number. Keep looping until the user guesses 7 correctly, then print "Correct!".
	Name: Sean
	Date Created: 2024/11/11
	Date last modified: 2024/11/11
*/
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int num;
     int mnum = 7;
      while (true){
       System.out.print("guess the magic number");
        num = scanner.nextInt();
        if (num == mnum){
          System.out.print("correct");
          break;
        }
      }
    }
}