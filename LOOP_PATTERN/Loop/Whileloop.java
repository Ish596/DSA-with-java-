//package LOOP_PATTERN.Loop;
import java.util.*;
public class Whileloop {
    

    public static void main(String[]args) 
{
    Scanner sc = new Scanner (System.in);
    double a, b=0, i,c=1 ;
    System.out.print("enter the value from where i start ");
    i = sc.nextDouble();
     System.out.print("enter the value from where a end ");
     a = sc.nextDouble();
      while(i<=a) 
        {
        
    b = b+i;
    c = c*i;
    System.out.println(" hello");
    i++;  

      }
      System.out.println(" "+b);
System.out.println(" "+c);
sc.close();
    }
}
    


    


