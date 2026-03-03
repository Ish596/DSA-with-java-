
import java.util.*;
public class ELIF{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);
        double att;
        System.out.print(" attendence percentage ");
        att = sc.nextDouble();
        if( att >=75)
        { 
            System.out.println(" egligble for  st");
        }
        else if( att >= 60)
        {
            System.out.println( " egligible with medical ");
        }
        else
        {
            System.out.println( " detained ");
            System.out.println("express reason for short attendence");

        }
        sc.close();


    }
    
}
