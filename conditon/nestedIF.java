/*greatest of three number  */

import java.util.*;
public class nestedIF {
    public static void main (String args [])
    {
        Scanner sc = new Scanner (System.in);
        double a,b,c;
        System.out.print("enter the value of a ");
        a = sc.nextDouble();
        System.out.print("enter the value of b ");
        b = sc.nextDouble();
        System.out.print("enter the value of c ");
        c = sc.nextDouble();
        if (a>b && a>c )
        {
            System.out.println("a is largest");

        }
        if(b>c && b>a){
            System.out.println("b is greatest");
        }
        if(c>a && c>b)
        { 
            System.out.println(" c is greatest");
        }
        else{ 
            System.out.println ( "invalid input ");
        }
        sc.close();
    }
    
}
