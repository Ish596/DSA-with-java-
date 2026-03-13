import java.util.*;
public class Afunction {
    public static void printMyName(String name) 
    {
        System.out.print("so name is ");
System.out.println(name);
return;

    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter name  ");
        String name = sc.next();

        printMyName(name);

        sc.close();
       
    }
    
     
}