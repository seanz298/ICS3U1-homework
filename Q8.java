/**
Q8.java
	Description:  
	Name: Sean
	Date Created: 2024/11/8
	Date last modified: 2024/11/8
*/
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("which question do you want to see?only 1-6");
      int ques = scanner.nextInt();
      switch (ques){
      
        case 1:
        String a = " System.out.println('what color does alex use');";
        String b = "String color = scanner.nextLine();";
        String c = "if (color.equals('red')){ ";
        String d = "System.out.println('Alex is in a bad mood.'');";
        String e = "};";
        String f = "else{";
        String g = "System.out.println('Alex is in a good mood.'');";
        String h = "}";
        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", a , b ,c ,d, e , f , g , h);
      break; 
      
         case 2:
          String i = "System.out.println('how many pairs of blue jeans do you own?');";
          String j = "int jeans = scanner.nextInt();";
          String k = "if (jeans != 0) {";
          String l = "System.out.println('You have a fashionable wardrobe!');  ";
          String m = "}";
          String n = "else {";
          String o = "System.out.println('According to Monika, you need at least one pair of blue jeans!''); ";
          String p = "}";
          System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", i, j, k, l, m, n, o, p);
      break;
      
        case 3: 
          String q = "System.out.println('How long did Hamza partise in hours');";
          String r = "int time = scanner.nextInt();";
          String s = " if (time>2){";
          String t = "System.out.println('Hamza is doing too much extra work');";
          String u = "}";
          String v = "else{";
          String w = "System.out.println('Hamza isn't doing too much extra work');";
          String x = "}";
          System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n",q, r, s, t, u, v, w, x); 
      break;

        case 4:
          String y = "System.out.println('How many homework questions did you do');";
          String z = "int que = scanner.nextInt();";    
          String A = "if (que>3){";
          String B = "System.out.println('You can play games in class');";
          String C = "}";
          String D = "else{";
          String E = "System.out.println('You can not play games in class');";
          String F = "}";
          System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n",y, z, A, B, C, D, E, F); 
      break;

       case 5:
          String G = "System.out.println('How long did Hamza partise in hours');";
          String H = "int tim = scanner.nextInt();";
          String I = "if (tim>=2){";
          String J = "System.out.println('Hamza is doing too much extra work');";
          String K = " }";
          String L = "else{";
          String M = "System.out.println('Hamza isn't doing too much extra work');";
          String N = " }";
          System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n",G, H, I, J, K, L, M, N); 
      break;
          
      case 6:
          String O = "System.out.println('How many homework questions did you do');";
          String P = "int quess = scanner.nextInt();";
          String Q = "if (quess >= 3){";
          String R = "System.out.println('You can play games in class');";
          String S = "}";
          String T = "else{";
          String U = "System.out.println('You can not play games in class');";
          String V = "}";
          System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n",O, P, Q, R, S, T, U, V); 
      break;
      }
    }
}