import java.util.*;
public class Gfunction {
    public static void greatest(int a,int b ){
        if ( a>b)
        {
            System.out.println(" a is greater ");
        }
         else if ( b>a)
        {
            System.out.println("  b is greater ");
        }
         else if ( a==b )
        {
            System.out.println(" both are equal ");
        }
        else {
            System.out.println(" invalid input ");
        }
        return; 

    }
    public static void main ( String args []){
        Scanner sc = new Scanner ( System.in );
        System.out.println(" the value of a is ");
        int a = sc.nextInt();
        System.out.println(" the value of b is ");
        int b = sc.nextInt();
        greatest(a, b);

        sc.close();
    
    
    }
    
}
