import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        System.out.println(fact);
    }
}
