package LOOP_PATTERN.Loop;
import java.util.*;

public class Forloop  {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int a,i,c=0;
        System.out.print("enter the value of a  ");
        a = sc.nextInt();
        for(i =1;i<=a;i++)
        {
            c = c+i;
           
        }
         System.out.println(" the addition is "+c);
            
        sc.close();
    }
}

