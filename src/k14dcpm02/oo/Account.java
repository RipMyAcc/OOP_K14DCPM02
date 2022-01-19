package k14dcpm02.oo;

public class Account {
    int account_number = 12345;
    int account_balance;

    void deposit(int amount){

        account_balance += amount;

    }

    void withdraw(int amount){

        account_balance -= amount;

    }

    void show(){
        System.out.println("Thông tin của tài khoản: " );
        System.out.println("Account number: " + account_number);
        System.out.println("Account balance: " + account_balance);
    }

}
