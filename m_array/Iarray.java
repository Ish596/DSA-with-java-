
// print array usiong for ech loop 
import java.util.*;

public class Iarray {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
      for (int i : arr) {
         System.out.print(i + " ");

      }
      sc.close();

   }
}
