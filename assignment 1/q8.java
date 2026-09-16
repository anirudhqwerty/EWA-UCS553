import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), sign = n < 0 ? -1 : 1, reverse = 0;
        n = Math.abs(n);
        while (n > 0) {
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }
        System.out.println(sign * reverse);
    }
}
