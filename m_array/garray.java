// adding and multiplication in array elemnt
import java.util.*;
public class garray {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);
        System.out.println(" enetr the size of array ");
        int m = sc.nextInt();
        int arr[] = new int[m];
        System.out.println(" enter array element");
        for(int i = 0 ; i<m ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(" the array is ");
        for ( int i = 0 ; i< m ; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println(" multiply odd index elements by 2 and add 10 in evenm index ");
        for ( int i = 0;i<m;i++){
            if ( i%2 == 1){
                arr[i] = (arr[i]*2);
            }
            else {
                arr[i] = ( arr[i]+10);
            }
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }

    
}
