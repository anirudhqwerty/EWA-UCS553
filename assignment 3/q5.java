class insufficientbalanceexception extends Exception { insufficientbalanceexception(String message) { super(message); } }
class invalidamountexception extends Exception { invalidamountexception(String message) { super(message); } }
class accountnotfoundexception extends Exception { accountnotfoundexception(String message) { super(message); } }
class account {
    double balance = 1000;
    void deposit(double amount) throws invalidamountexception { if (amount <= 0) throw new invalidamountexception("invalid deposit"); balance += amount; }
    void withdraw(double amount) throws invalidamountexception, insufficientbalanceexception { if (amount <= 0) throw new invalidamountexception("invalid withdrawal"); if (amount > balance) throw new insufficientbalanceexception("insufficient balance"); balance -= amount; }
}
public class q5 {
    static account find(String number) throws accountnotfoundexception { if (!number.equals("101")) throw new accountnotfoundexception("account not found"); return new account(); }
    public static void main(String[] args) {
        try { account a = find("101"); a.deposit(500); a.withdraw(200); System.out.println(a.balance); }
        catch (Exception e) { System.out.println(e.getMessage()); }
    }
}
