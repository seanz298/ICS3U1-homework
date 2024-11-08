/**
Q5.java
	Description:  a program using <=  that will decide whether Hamza is doing too much extra work. 
	Name: Sean
	Date Created: 2024/11/6
	Date last modified: 2024/11/6
*/
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("How long did Hamza partise in hours");
      int time = scanner.nextInt();
      if (time>=2){
        System.out.println("Hamza is doing too much extra work");
      }
        else{
         System.out.println("Hamza isn't doing too much extra work");
        }
    }
}