import javax.print.DocFlavor;

public class Account {
    private String user;
    private double balance;
    public Account(String user){
        user = this.user;
    }

    public void addBalance(double balance) throws Exception{
        if(balance < 0){
            throw new Exception("Value is not valid");
        }
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

}
