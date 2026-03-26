// max min from array
//package m_array;
import java.util.*;
public class darray 
{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println(" enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println(" enter the elements of array");
         for ( int i = 0; i<n; i++){
            arr[i]= sc.nextInt();
         }
         System.out.println("the array is ");
         for( int i = 0 ; i <n ; i++){
            System.out.println(arr[i]);
         }
          int j = arr[0];
         System.out.println(" the mmaximum  is ");
         for ( int i = 1; i<n ;i++){
              j = Math.max( j , arr[i]);}
             System.out.println(j);
         
         int d = arr[0];
         System.out.println(" the minimum  is ");
         for ( int i = 1 ; i<n ;i++){
            d = (Math.min( d, arr[i]));
         }
         System.out.println(d);
        sc.close();
    }
    
}
