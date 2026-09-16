abstract class libraryresource {
    protected int resourceid;
    protected String title;
    protected String author;
    static String libraryname = "city library";
    static int count;
    libraryresource(int id, String title, String author) { resourceid = id; this.title = title; this.author = author; count++; }
    abstract double fine(int days);
    static void totalresources() { System.out.println("resources " + count); }
}
interface printable { void printdetails(); }
class book extends libraryresource implements printable {
    book(int id, String title, String author) { super(id, title, author); }
    double fine(int days) { return days * 5; }
    public void printdetails() { System.out.println(resourceid + " " + title + " " + author); }
}
class digitalresource extends libraryresource implements printable {
    digitalresource(int id, String title, String author) { super(id, title, author); }
    double fine(int days) { return days * 2; }
    public void printdetails() { System.out.println(resourceid + " " + title + " " + author); }
}
public class q2 {
    static boolean validid(int id) { return id > 0; }
    static boolean validdays(int days) { return days >= 0; }
    public static void main(String[] args) {
        libraryresource[] resources = {
            new book(1, "java", "james"), new book(2, "networks", "andrew"),
            new digitalresource(3, "cloud", "mark"), new digitalresource(4, "security", "alice"),
            new book(5, "databases", "peter")
        };
        int[] days = {2, 0, 4, 3, 1};
        double total = 0;
        for (int i = 0; i < resources.length; i++) {
            if (validid(resources[i].resourceid) && validdays(days[i])) {
                ((printable) resources[i]).printdetails();
                total += resources[i].fine(days[i]);
            }
        }
        System.out.println("total fine " + total);
        libraryresource.totalresources();
    }
}
