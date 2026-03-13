import java.util.*;
public class Dfunction {
    public static void fact( int a){
        if (a<0){
            System.out.println("Invalid input ");
            return;
        }
        int j = 1;
        for ( int i = a; i>=1 ;i-- ){
            j= j*i; }
        System.out.println("factorial is " + j);
        return;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);
        System.out.print("enter the number ");
        int a = sc.nextInt();
    fact(a);

     sc.close();   
    }
    
}
