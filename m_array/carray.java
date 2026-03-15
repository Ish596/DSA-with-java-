package m_array;
import java.util.*;

public class carray {
   public  static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    System.out.println(" enter the size of array");
    int m = sc.nextInt();
    String arr[] = new String[m];
    System.out.println(" enter names ");
    for( int i =0 ; i<m ; i++)
    {
        arr[i] = sc.next();
    }
    System.out.println("the names are ");
    for ( int i = 0; i<m;i++){
        System.out.println(arr[i]);

    }
    int flag =0;
    System.out.println(" input to find name  ");
    String req = sc.next();

    for(int i =0;i<m;i++){
      if   ( req.equals(arr[i]))  {
            System.out.println(" the name found at index "+ i);
            flag ++;
        }
    }
    if (flag == 0){
        System.out.println(" name not present or invalid input ");
    }
    sc.close();

   } 
}
