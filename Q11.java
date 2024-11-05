/**
Q11.java
	Description: program to calculate your total cost after applying the discount.
	Name: Sean
	Date Created: 2024/10/16
	Date last modified: 2024/10/17
*/
 public class Q11 {
    public static void main(String[] args) {
    int iac = 20;//item a
    int ibc = 15;//item b
    int icc = 10;//item c
    int itb = 3;// item bought
      int tc = (iac + ibc + icc + itb*5);
      System.out.println("your total cost is " + tc);
    }
  }