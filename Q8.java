/**
Q8.java
	Description:Create an interface that loops and allows the user to choose another question. The program should allow the user to select another question. 
	Name: Sean
	Date Created: 2024/11/11
	Date last modified: 2024/11/11
*/
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int choice;
      do{
        System.out.println("choose a question 1-7. enter 8 exit");
          choice = scanner.nextInt();
      switch (choice){
          
        case 1:
           int num = 1;
        while (num<=5){
        System.out.println(num);
        num++;
        }
          break;
        case 2:
                int num2;
      while (true){
      System.out.println("enter a number");
       num2 = scanner.nextInt();
        if (num2 == 10){
          System.out.println("you gor it");
          break;
        }
      }
          break;
        case 3:
       int num3 = 0;
       do {
        System.out.println(num3);
        num3++;
        }while (num3<=5);
break;
        case 4:
                int magnum = 7;
      int num4;
      while (true){
       System.out.print("guess the magic number");
        num4 = scanner.nextInt();
        if (num4 == magnum){
          System.out.print("correct");
          break;
        }
      }
break;
        case 5:
      int age;
      while (true){
        System.out.print("enter your age");
        age = scanner.nextInt();
        if (age >=18){
          System.out.print("old enough");
        }
        else{
          System.out.print("too young");
          break;
        }
      }
          break;
        case 6:
      String cpw = "JavaFun";
      String pw;
      do {
        System.out.println("enter password");
        pw = scanner.nextLine();
      }while(!pw.equals(cpw));
      System.out.println("Access Granted");
break;
        case 7:
       int num7 = 10;
      while (num7>0){
        System.out.println("Processing item...");
        num7--;
      }
      System.out.println("all items processed");
       break;

        default:
          System.out.println("Invalid choice. Please try again.");
      }  
      }while (choice != 8);
    }
}