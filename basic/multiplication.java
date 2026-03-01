import java.util.*;
public class multiplication
{ 
    public static void main (String[]args)
    {
        Scanner in = new Scanner(System.in);
        double a ,b , mul;
        System.out.print( " enter the valur for a ");
        a = in.nextDouble();
        System.out.print(" enter the value for b ");
        b = in.nextDouble();
        mul = a*b;
    System.out.print (" the multiplication of two numbers are " + mul);
    in.close();
    }
}