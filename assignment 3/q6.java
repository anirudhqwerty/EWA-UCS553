class invalidusernameexception extends Exception { invalidusernameexception(String m) { super(m); } }
class invalidpasswordexception extends Exception { invalidpasswordexception(String m) { super(m); } }
class accountlockedexception extends Exception { accountlockedexception(String m) { super(m); } }
public class q6 {
    static int attempts;
    static void login(String user, String pass) throws Exception {
        if (attempts >= 3) throw new accountlockedexception("account locked");
        if (!user.equals("admin")) throw new invalidusernameexception("invalid username");
        if (!pass.equals("java")) { attempts++; throw new invalidpasswordexception("invalid password"); }
        System.out.println("login successful");
    }
    public static void main(String[] args) {
        try { login("admin", "java"); }
        catch (Exception e) { System.out.println(e.getMessage()); }
        finally { System.out.println("login checked"); }
    }
}
