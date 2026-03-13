import java.util.*;
public class Bfunction {
    public static int Add( int a, int b) {
         int sum = a+b ;
        
     
        return sum ;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a");
        int a = sc.nextInt();
    System.out.println("enter b");
        int b = sc.nextInt();
        int sum = Add(a ,b);
        System.out.println("sum = "+sum);
      
      sc.close();
    }
    
}
