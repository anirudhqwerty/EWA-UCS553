import java.util.ArrayList;

class product { String name; double price; product(String n, double p) { name = n; price = p; } }
public class q7 {
    public static void main(String[] args) {
        ArrayList<product> cart = new ArrayList<>();
        cart.add(new product("book", 250));
        cart.add(new product("pen", 30));
        String search = "book";
        for (product p : cart) if (p.name.equals(search)) System.out.println(p.name + " " + p.price);
        double total = 0;
        for (product p : cart) total += p.price;
        System.out.println("total " + total);
    }
}
