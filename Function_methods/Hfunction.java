import java.util.*;
public class Hfunction {
    public static void vote( int age){
        if ( age >= 18  )
        {
            System.out.println(" person can vote ");

        }
        else 
        {
            System.out.println(" cannot vote ");
        }
        return;

    }
    public static void main ( String []args ){
        Scanner sc = new Scanner ( System.in );
        System.out.print(" enter age  ");
    int age = sc.nextInt();
    vote(age);

    sc.close();
    }
    
}
