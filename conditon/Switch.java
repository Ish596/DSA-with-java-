import java.util.*;
public class Switch
{
    public static void main( String[]args)
    {
        Scanner sc = new Scanner (System.in);
        double b,i, a;
        System.out.print("enter 1st value  ");
        a = sc.nextDouble();
        System.out.print("enter 2nd value ");
        b = sc.nextDouble();
        System.out.println("enter the operator = '+','-' '*' '/' '%' ");
        char op = sc.next().charAt(0);
    switch (op) 
    {
         case '+' :
        i = a+b;
        System.out.print(" the addition of digits are " +i);
        break;

        case '-':
            i = a-b;
            System.out.println(" the subtraction of digits are " +i);
            break;

            case'*':
            i = a*b;
            System.out.println(" the multiplication of digits are " +i);
            break;

        case '/':
            i = a/b;
            System.out.println(" the division of the digit are " +i);
            break;

            case '%':
                i = a%b;
                System.out.println("the modoulus of digit are " +i);
                break;

                default:
                System.out.println("wrong choice ");

    }
    sc.close();


    }
}