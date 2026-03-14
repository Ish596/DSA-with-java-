import java.util.*;

public class EFunction {
    public static int avg(int a, int b, int c) {

        int avg = (a + b + c) / 3;

        return avg;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("the value of a is ");
        int a = sc.nextInt();
        System.out.println("the value of b is ");
        int b = sc.nextInt();
        System.out.println(" the value of c is ");
        int c = sc.nextInt();
        int avg = avg(a, b, c);
        System.out.println("the average is ");
        System.out.println(avg);

        sc.close();
    }

}
