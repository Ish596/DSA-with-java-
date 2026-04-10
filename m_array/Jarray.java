
//reverse of an array
import java.util.*;

public class Jarray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" eneter size of array");
        int m = sc.nextInt();
        int arr[] = new int[m];
        int n = m - 1;
        System.out.println(" enter array elements");
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(" the original array is ");
        for (int i = 0; i < m; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < m; i++) {
            while (i < n) {
                int temp = arr[i];
                arr[i] = arr[n];
                arr[n] = temp;
                i++;
                n--;
            }
        }
        System.out.println(" reversed array is ");
        for (int d : arr) {

            System.out.print(d + " ");
        }
        sc.close();
    }

}
  