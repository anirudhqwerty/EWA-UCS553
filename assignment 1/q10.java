import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String value = in.next();
        String reverse = new StringBuilder(value).reverse().toString();
        if (value.equals(reverse)) System.out.println("palindrome");
        else System.out.println("not a palindrome");
    }
}
