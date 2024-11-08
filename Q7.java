/**
Q7.java
	Description:  Put all questions in an interface that allows the user to choose a question and only that particular question will run
	Name: Sean
	Date Created: 2024/11/6
	Date last modified: 2024/11/6
*/
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("which question do you want to see?only 1-6");
      int ques = scanner.nextInt();
      switch (ques){
      
        case 1:
          System.out.println("What color does alex use");
    String color = scanner.nextLine();
      if (color.equals("red")){
      System.out.println("Alex is in a bad mood. ");
      }
      else{
      System.out.println("Alex is in a good mood. ");
             }
      break;
      
         case 2:
          System.out.println("how many pairs of blue jeans do you own?");
      int jeans = scanner.nextInt();
      if (jeans != 0) {
        System.out.println("You have a fashionable wardrobe!");  
      }
      else {
        System.out.println("According to Monika, you need at least one pair of blue jeans!");  
      }
      break;
      
        case 3: 
      System.out.println("How long did Hamza partise in hours");
      int time = scanner.nextInt();
      if (time>2){
        System.out.println("Hamza is doing too much extra work");
      }
                else{
         System.out.println("Hamza isn't doing too much extra work");
        }
      break;

        case 4:
         System.out.println("How many homework questions did you do");
      int que = scanner.nextInt();
      if (que>3){
      System.out.println("You can play games in class");
      }
      else{
      System.out.println("You can not play games in class");
      }
      break;

       case 5:
          System.out.println("How long did Hamza partise in hours");
      int tim = scanner.nextInt();
      if (tim>=2){
        System.out.println("Hamza is doing too much extra work");
      }
        else{
         System.out.println("Hamza isn't doing too much extra work");
        }
      break;

      case 6:
         System.out.println("How many homework questions did you do");
      int quess = scanner.nextInt();
      if (quess >= 3){
      System.out.println("You can play games in class");
      }
      else{
      System.out.println("You can not play games in class");
      }
      break;
      }
    }
}