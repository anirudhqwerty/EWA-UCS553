public class q1 {
    public static void main(String[] args) {
        try { int x = 10 / 0; } catch (ArithmeticException e) { System.out.println("arithmetic exception"); }
        try { String x = null; x.length(); } catch (NullPointerException e) { System.out.println("null pointer exception"); }
        try { int[] x = {1, 2}; System.out.println(x[3]); } catch (ArrayIndexOutOfBoundsException e) { System.out.println("array index exception"); }
        try { Integer.parseInt("abc"); } catch (NumberFormatException e) { System.out.println("number format exception"); }
    }
}
