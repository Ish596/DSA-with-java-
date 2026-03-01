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
        /*it is a basic program so divide by 0 zero 
        condion is not mentioned yet intensionally*/
        System.out.println(" division" + div);
        in.close();

    }
}
