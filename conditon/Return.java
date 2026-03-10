// simple return program
public class Return {
    public static void main(String[] args) {

        int a = 5;

        if(a > 0){
            System.out.println("Positive number");
            return;
        }

        System.out.println("This line will not execute");
    }
}