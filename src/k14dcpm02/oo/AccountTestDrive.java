package k14dcpm02.oo;

public class AccountTestDrive {
    public static void main(String[] args) {

        Account account = new Account();
        
        account.show();
        account.deposit(1000);
        account.show();
        account.withdraw(333);
        account.show();
    }
}
