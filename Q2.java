/**
Q2.java
	Description: asks the user for their favourite movie, the name of a friend, the date and time of the movie, and the location. Print a formatted movie night ticket.
	Name: Sean
	Date Created: 2024/10/29
	Date last modified: 2024/10/29
*/
import java.util.Scanner;
 public class Q2 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("what is your favourite movie?");//ask user
     String movie = scanner.nextLine();
     System.out.println("Who is your best friend");
     String friend = scanner.nextLine();
     System.out.println("What is the time and date of the movie");
     String time = scanner.nextLine();
     System.out.println("Where is the location");
     String location = scanner.nextLine();
     System.out.println("------------------------" );
     System.out.printf("%-22s %-1s%n" , "|","|" );//print ticket
     System.out.printf("%-22s %-1s%n" , "|","|"); 
     System.out.printf("%-5s %s %-10s %s%n" , "|", "name:" , friend,"|");
     System.out.printf("%-5s %-16s %s%n" , "|", movie ,"|");
     System.out.printf("%-5s %-16s %s%n" , "|", time ,"|");
     System.out.printf("%-5s %-16s %s%n" , "|", location ,"|");
      System.out.println("------------------------" );
    }
 }