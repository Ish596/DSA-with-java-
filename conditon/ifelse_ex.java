/*vote elegiblity */

import java.util.*;
public class ifelse_ex {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.print("enter age ");
        age = sc.nextInt();
        if (age>=18)
        {
            System.out.println("person can vote");
        }
        else{
            System.out.println("person cannot vote");
        }
        sc.close();
    }

}
