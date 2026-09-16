import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        int x = a, y = b;
        while (y != 0) {
            int c = x % y;
            x = y;
            y = c;
        }
        System.out.println(Math.abs(a * b / x));
    }
}
