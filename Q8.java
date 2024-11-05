/**
Q8.java
	Description:  asks the user fo;r two numbers and prints their sum, difference, product, and quotient
	Name: Sean
	Date Created: 2024/10/16
	Date last modified: 2024/10/16
*/
import java.util.Scanner;
 public class Q8 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("please give me a number");
    int nm1 = scanner.nextInt(); 
    System.out.println("please give me another number");
    int nm2 = scanner.nextInt(); 
    int total = (nm1 + nm2);
    int diff = (nm1 - nm2);
    int prod = (nm1 * nm2);
    int quot = (nm1 / nm2);
    System.out.println(nm1 + " + " + nm2 +" = " + total);
      System.out.println(nm1 + " - " + nm2 + " = " + diff);
      System.out.println(nm1 + " * " + nm2 +" = " + prod);
      System.out.println(nm1 + " / " + nm2  + " = " + quot);
    }
 }