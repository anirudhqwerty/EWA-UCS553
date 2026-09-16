public class q2 {
    public static void main(String[] args) {
        try {
            try { int x = 10 / 0; } catch (ArithmeticException e) { System.out.println("inner exception"); }
            int[] a = {1};
            System.out.println(a[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("outer exception");
        }
    }
}
