package LOOP_PATTERN.Loop;
import java.util.*;

public class Dowhile 
    
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner( System.in);
        double i,j,a=0;
        System.out.print(" enter the value of i  ");
        i = sc.nextDouble();
        System.out.print(" enetr the value of j  ");
        j = sc.nextDouble();
        do{
           a= i+j+a;
           System.out.println(""+a);
           i++;
        }
        
        while(i<j);
    //     {
    //         double d =i*j;
            
    //     System.out.println(""+d);
        
    // }
     sc.close();

}
   

    
}

