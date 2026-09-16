import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            double a = Double.parseDouble(in.next()), b = Double.parseDouble(in.next());
            char op = in.next().charAt(0);
            if (op == '+') System.out.println(a + b);
            else if (op == '-') System.out.println(a - b);
            else if (op == '*') System.out.println(a * b);
            else if (op == '/') {
                if (b == 0) throw new ArithmeticException();
                System.out.println(a / b);
            } else throw new IllegalArgumentException();
        } catch (NumberFormatException e) { System.out.println("invalid number"); }
        catch (ArithmeticException e) { System.out.println("cannot divide by zero"); }
        catch (IllegalArgumentException e) { System.out.println("invalid operator"); }
    }
}
