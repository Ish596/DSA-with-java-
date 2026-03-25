
// combination, permutation amd factorial
import java.util.*;
public class Ifunctionm{
  
    public static double fact(double x ){
          double f = 1;
        for ( double i =1 ;i <= x; i++){
             f *= i;
        }
             ;  
 return f;
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print(" value of n is  ");
    double n = sc.nextDouble();
    System.out.print(" value of r is  ");
    double  r = sc.nextDouble();
    double ncr = fact(n)/(fact(r)*fact(n-r));
    double  npr =  fact(n)/fact(n-r);
     double c = fact(n);
System.out.println(" the factorial of n is "+c);
double d = fact(r);
System.out.println(" the factorial of r is " +d);
    System.out.println(" combination is "+ncr);
    System.out.println(" permutation is "+npr);
   
    sc.close(); 


   }
}