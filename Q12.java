/**
Q12.java
	Description: calculate the total calories burned during the workout.
	Name: Sean
	Date Created: 2024/10/17
	Date last modified: 2024/10/17
*/
 public class Q12 {
    public static void main(String[] args) {
    int runt = 30;//eunning time
    int biket = 45;//bike time
      int rpc = 10;// running burn colories per min
      int bpc = 8;// biking burn colories per min
      int tc = (runt * rpc + biket * bpc);
      System.out.println("your total calories are " + tc);
    }
 }