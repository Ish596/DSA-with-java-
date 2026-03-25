// swap two numbers 
import java.util.*;
public class Kfunction {
  public static void swap(int a , int b ) 
  {
    a = a+b;
    b = a-b;
    a = a-b;
    System.out.println(a);
    System.out.println(b);
  }  
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println(" enter a ");
    int a = sc.nextInt();
    System.out.println(" enter b ");
    int b = sc.nextInt();
     swap(a, b);
    sc.close();
    
}

}
