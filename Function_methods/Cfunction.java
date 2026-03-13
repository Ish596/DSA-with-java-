import java.util.*;
public class Cfunction {
 public static int Multiply(int a, int b){
 int  mul = a*b;
 return mul;
   
 
 }

 public static void main( String args []){
    Scanner sc = new Scanner ( System.in );
    System.out.print("enter the value of a");
    int a = sc.nextInt();
    System.out.print("enter value of b");
    int b = sc.nextInt();
      int mul =Multiply( a, b);
      System.out.println("multipliction is "+ mul);
      sc.close();
 }
}
