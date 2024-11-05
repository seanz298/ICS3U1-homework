/**
Q13.java
	Description: calculate your total monthly expenses
	Name: Sean
	Date Created: 2024/10/17
	Date last modified: 2024/10/17
*/
 public class Q13 {
    public static void main(String[] args) {  
      int rent = 600;// rent cost
      int util = 150;//utilities cost
      int groc = 200;// groceries cost
      int save = 100;//saveing
         int totalcost = (rent + util + groc - save);
    System.out.println("your monthly cost is " + totalcost);
    
   }
 }