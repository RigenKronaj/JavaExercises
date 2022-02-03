public class Account {
    // Declaring the single attribute of the Account class
    private double balance;

    // Declaring the default Constructor
    public Account() {
        balance=0;
    }

    // Declaring the oveloaded Constructor
    public Account(double initialBalance) {
    if (initialBalance > 0.0) balance=initialBalance;
    }
    
    // Declaring two setter methods
    public void credit(double amount){
    balance=balance+amount;
    }
    
    public void debit(double amount){
        if(amount > balance)
            System.out.println("Debit amount exceeded account balance.");
        else
            balance -= amount;
    
    }
    
    // Declaring a getter method
    public double getBalance(){
    return balance;
    }
}
