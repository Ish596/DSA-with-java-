import java.util.*;
public class division {
    public static void main (String []args)
    {
        Scanner in = new Scanner (System.in);
        double a,b,div ;
        System.out.print("enetr the value of a ");
        a=in.nextDouble();
        System.out.print( " enter the value of b ");
        b= in.nextDouble();
        div = a/b;
        
        System.out.println(" division =  " +div);
        in.close();

    }
}
