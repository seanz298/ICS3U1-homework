
/**
Q7.java
	Description :Imagine you have an inventory of 10 items. Use a while loop to decrease the count by 1 with each loop, printing the message "Processing item..." each time. Stop when there are no items left, and print "All items processed."
	Name: Sean
	Date Created: 2024/11/11
	Date last modified: 2024/11/11
*/
public class Q7 {
    public static void main(String[] args) {
      int num = 10;
      while (num>0){
        System.out.println("Processing item...");
        num--;
      }
      System.out.println("all items processed");
    }
}