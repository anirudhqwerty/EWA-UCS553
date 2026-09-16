import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        while (b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        System.out.println(Math.abs(a));
    }
}
