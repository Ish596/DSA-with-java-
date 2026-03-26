// sum of array elements 
import java.util.*;
public class earray{
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);
        System.out.println(" the size of the array is ");
        int m = sc.nextInt();
        int arr[] = new int[m];
        System.out.println(" enter the elements of array");
        for( int i = 0; i<m; i ++){
             arr[i] = sc.nextInt(); 
        }
        System.out.println( "the array is  ");
        for( int i = 0; i<m;i++){ 
        System.out.print(  arr[i]+ " ");
               }
    int sum = 0; 
    System.out.println("");
    System.out.print(" the sum of array element is ");
    for( int i = 0; i<m;i++){ 
        sum = sum + arr[i];  
    }
     System.out.println(sum);
     sc.close();
}
    }

