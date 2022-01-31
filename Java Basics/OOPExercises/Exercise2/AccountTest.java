public class AccountTest {
    public static void main(String[] args) {
        Account accountOne = new Account(500);
        Account accountTwo = new Account(10000);
        
        accountOne.debit(3000);
        accountTwo.debit(3000);
    }
}
