import java.util.Scanner;

public class BookReview {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the title of your favourite book: ");
        String title = scanner.nextLine();
        
        System.out.print("Enter the author's name: ");
       String author = scanner.nextLine();
        
        System.out.print("Enter the genre of the book: ");
        String genre = scanner.nextLine();
        
        System.out.print("Rate the book out of 10: ");
       int rating = scanner.nextInt();
        

        System.out.println("--------------------------------");
        System.out.println("Book Review");
        System.out.println("--------------------------------");
        System.out.printf("Title         : %-20s%n", title);
        System.out.printf("Author        : %-20s%n", author);
        System.out.printf("Genre         : %-20s%n", genre);
        System.out.printf("Rating        : %d/10%n", rating);
        System.out.println("--------------------------------");
        
  
    }
}
