/**
Q14.java
	Description: program to calculate your final score.
	Name: Sean
	Date Created: 2024/10/17
	Date last modified: 2024/10/17
*/
 public class Q14 {
    public static void main(String[] args) {  
      int  levels = 5;
      int mistakes = 2;
      int totalscore = (levels * 100 - mistakes * 20);
        System.out.println("your total score is " + totalscore);
    }
 }