package k14dcpm02.tructured;

import java.util.Scanner;

public class Bank {
    
    static int account_number = 12345;
    static int account_balance = 0;

    static String emName;
    public static void main(String[] args) {
        
        
        deposit();
        
        show();
        
        withdraw();
        
        show();
       
        withdraw();
        
        show();

    }

    static void show() {

        System.out.println("Thông tin của tài khoản: ");
        System.out.println("Account number: " + account_number);
        System.out.println("Account balance: " + account_balance);
    }

    static void withdraw(){
        int inputWithdrawAmount;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số tiền rút > ");
        inputWithdrawAmount = input.nextInt();
        account_balance -= inputWithdrawAmount;

    }

    static void deposit(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số tiền gửi > ");
        int inputAmount = input.nextInt();
        account_balance += inputAmount;

    }

    static void xyz(){
        account_balance = 0;
    }

    void themNhanVienMoi(){
        account_balance +=  100;

    }

    void inDanhSachNhanVien(){

    }
}
