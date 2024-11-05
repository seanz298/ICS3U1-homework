import java.util.Scanner;
public class Q15{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
      System.out.println("What is your favorite sport? ");
        String sport = scanner.nextLine();
      System.out.println("What is your favorite team? ");
      String team = scanner.nextLine();
      System.out.println("Your favorite sport is "+ sport + ", your favourate team is " + team);
    }
}