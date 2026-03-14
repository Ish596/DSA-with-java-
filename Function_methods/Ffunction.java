import java.util.*;

public class Ffunction {
    public static void sum(int a) {
        int j = 0;
        for (int i = 1; i <= a; i++) {
            if (i % 2 == 0)
                continue;
            else {
                j = j + i;
            }
        }
        System.out.println(j);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("the value of a is  ");
        int a = sc.nextInt();
        sum(a);
        sc.close();

    }

}
