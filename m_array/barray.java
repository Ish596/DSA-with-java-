//linear search
//package m_array;
import java.util.*;
public class barray {
    public static void main(String args[]){
    Scanner sc = new Scanner ( System.in);
    System.out.println(" no of elements in array are");
 int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println(" elemnts are ");
    for (int i =0;i<n ;i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("the array is ");
    for ( int i =0 ; i<n; i++){
        System.out.println(arr[i]);
    }
      int req , count=0;
    System.out.println("the no need to be found is ");
    req = sc.nextInt();
     for (int i =0;i<n;i++){
  
    if (req == arr[i]){
    System.out.println("the number found at position  "+i);
    count++;

    
    }}
    if(count ==0)

    { 
        System.out.println(" number is not is list or invalid input ");
    }
sc.close();
}
}