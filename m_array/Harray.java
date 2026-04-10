
// two sum using array
import java.util.*;

public class Harray {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a = -1, b = -1;
        System.out.println(" enter size of array");
        int m = sc.nextInt();
        int arr[] = new int[m];
        System.out.println(" enter array elements ");
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(" the array is ");
        for (int i = 0; i < m; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(" enter target ");
        int target = sc.nextInt();
        boolean find = false;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {

                if (i != j && arr[i] + arr[j] == target) {
                    find = true;
                    a = i;
                    b = j;
                    break;
                }
            }
        }
        if (find) {
            System.out.println(" the target found at index  " + b + " addition with index  " + a);
        } else {
            System.out.println(" target not found ");

        }

        sc.close();
    }

}
