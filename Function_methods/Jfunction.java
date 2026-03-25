// pass by value example 
import java.util.*;
public class Jfunction {
public static void count(int x ) {
    System.out.println(" inside function before changinhg value of x "+x);
     x = 5;
         System.out.println(" inside function after changinhg value of x "+x);
}  
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println(" pass by value examle  ");
    System.out.print(" enter the value of x ");
    int x = sc.nextInt();
    System.out.println( "the provided value is "+x);
    count(x);
    System.out.println(" value of x in main function still "+x);
    sc.close();
} 
}
