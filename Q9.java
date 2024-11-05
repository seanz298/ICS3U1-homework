/**
Q9.java
	Description: averages all your final marks for last semester. 
	Name: Sean
	Date Created: 2024/10/16
	Date last modified: 2024/10/16
*/
import java.util.Scanner;
 public class Q9 {
    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
      System.out.println("Hi what is your name");
      String name = scanner.nextLine();
      System.out.println("please enter 100 when you have a spare");//hint
    System.out.println("please tell me your first period score");// ask pq
    int p1 = scanner.nextInt(); 
    System.out.println("please tell me your second period score");//ask p2
    int p2 = scanner.nextInt(); 
      System.out.println("please tell me your third period score");//ask p3
       int p3 = scanner.nextInt(); 
      System.out.println("please tell me your fourth period score");// ask p4 score
       int p4 = scanner.nextInt(); 
      int sum = (p1 + p2 + p3 + p4);
      int aver =(sum / 4);
      System.out.println("Hi " + name + ", your semester average is " + aver);
    }
 }