abstract class foodorder {
    private int orderid;
    private String customername;
    private double amount;
    static String restaurantname = "simple bites";
    static int count;
    foodorder(int id, String name, double amount) { orderid = id; customername = name; this.amount = amount; count++; }
    double getamount() { return amount; }
    String getcustomername() { return customername; }
    abstract double deliverycharge();
    abstract double discount();
    static void totalorders() { System.out.println("orders " + count); }
    void bill() { double d = amount * discount(), c = deliverycharge(); System.out.println(orderid + " " + customername + " " + amount + " " + d + " " + c + " " + (amount - d + c)); }
}
class regularorder extends foodorder {
    regularorder(int id, String name, double amount) { super(id, name, amount); }
    double deliverycharge() { return 80; }
    double discount() { return .10; }
}
class premiumorder extends foodorder {
    premiumorder(int id, String name, double amount) { super(id, name, amount); }
    double deliverycharge() { return 50; }
    double discount() { return .15; }
}
public class q1 {
    public static void main(String[] args) {
        foodorder[] orders = {
            new regularorder(1, "aman", 400), new premiumorder(2, "riya", 800),
            new regularorder(3, "raj", 500), new premiumorder(4, "neha", 650),
            new regularorder(5, "mohit", 300), new premiumorder(6, "sana", 900)
        };
        for (foodorder order : orders) order.bill();
        foodorder.totalorders();
    }
}
