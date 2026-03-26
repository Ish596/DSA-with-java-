// array with functions 
//import java.lang.reflect.Array;
import java.util.*;
public class farray {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x[] = { 2,3,4,56,9};
        System.out.println(" array before change ");
        for ( int i = 0; i<x.length; i++){
            System.out.print(x[i] + " ");
        }
        System.out.println("");
        System.out.println(" array after change ");
        Arrays.sort( x);
      
        
        change(x);
        
         for ( int i = 0; i<x.length; i++){
            System.out.print(x[i] + " ");
    } 
   sc.close();
}
    public static void change( int[] x){

        x[3] = 7;
       
    }

    
  
}
