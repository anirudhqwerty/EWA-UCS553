import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Math.abs(in.nextInt());
        int count = n == 0 ? 1 : 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        System.out.println(count);
    }
}
