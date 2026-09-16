import java.util.Scanner;

class invalidmarksexception extends Exception { invalidmarksexception(String message) { super(message); } }

public class q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            int n = in.nextInt(), total = 0;
            for (int i = 0; i < n; i++) {
                int mark = in.nextInt();
                if (mark < 0 || mark > 100) throw new invalidmarksexception("marks should be between 0 and 100");
                total += mark;
            }
            double percentage = (double) total / n;
            String grade = percentage >= 80 ? "a" : percentage >= 60 ? "b" : percentage >= 40 ? "c" : "f";
            System.out.println(total + " " + percentage + " " + grade);
        } catch (invalidmarksexception e) { System.out.println(e.getMessage()); }
    }
}
