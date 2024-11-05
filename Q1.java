/**
Q1.java
	Description: introductions about superheroes
	Name: Sean
	Date Created: 2024/10/29
	Date last modified: 2024/10/29
*/
 public class Q1 {
    public static void main(String[] args) {
      String name1 = "iron man";
      String name2 = "spider man";
      String sp1 = "Powered Armor Suit and Flight";//superpower1
      String sp2 = "Spider-Sense";//superpower2
      int defnse1 = 90;// defnse0-100
      int defnse2 = 70;
      int speed1 = 85;
      int speed2 = 80;
      System.out.printf("%-15s %-30s %s %10s" , "superhero" , "superpower" , "defnse" , "speed");
      System.out.println(" ");
      System.out.println("-----------------------------------------------------------------------");
      System.out.printf("%-15s %-30s %s %10s", name1, sp1, defnse1, speed1);
      System.out.println(" ");
      System.out.printf("%-15s %-30s %s %10s", name2, sp2, defnse2, speed2);
    }
 }