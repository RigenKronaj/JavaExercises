public class AccountTest {
    public static void main(String[] args) {

        // Creating two objects of type Account
        Account accountOne = new Account(500);
        Account accountTwo = new Account(10000);
        
        // Calling a setter method for both Account objects
        accountOne.debit(3000);
        accountTwo.debit(3000);
    }
}
