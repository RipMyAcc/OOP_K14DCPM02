package k14dcpm02.nonTructure;

import java.util.Scanner;

public class Bank {
    static int account_number=12345;
    static int account_balance=0;
    public static void main(String[] args) {

         Scanner input=new Scanner(System.in);

         System.out.println("Nhập số tiền gửi: ");
        int inputAmount=input.nextInt();
        account_balance+=inputAmount;
        System.out.println();

        show();

        int inputWithdramAmount;
        System.out.println("Nhập số tiền cần rút");
        inputWithdramAmount=input.nextInt();
        account_balance-=inputWithdramAmount;
        System.out.println();

        show();

        System.out.println("Nhập số tiền cần rút");
        inputWithdramAmount=input.nextInt();
        account_balance-=inputWithdramAmount;
        System.out.println();

        show();

    }
    static void show(){
        System.out.println("Thông tin tài khoản");
        System.out.println("Account number: "+account_number);
        System.out.println("Account balance: "+account_balance);
        System.out.println();
    }

}
