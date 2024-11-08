/**
Q6.java
	Description:   using >=  that will decide if a student should play a game in class. 
	Name: Sean
	Date Created: 2024/11/6
	Date last modified: 2024/11/6
*/
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("How many homework questions did you do");
      int ques = scanner.nextInt();
      if (ques >= 3){
      System.out.println("You can play games in class");
      }
      else{
      System.out.println("You can not play games in class");
      }
    }
}