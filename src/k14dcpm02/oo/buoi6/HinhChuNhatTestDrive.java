package k14dcpm02.oo.buoi6;

import java.util.Scanner;

public class HinhChuNhatTestDrive {
    public static void main(String[] args) {
        HinhChuNhat hinhChuNhat=new HinhChuNhat();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        hinhChuNhat.setChieuDai(scanner.nextInt());
        System.out.print("Nhập chiều rộng: ");
        hinhChuNhat.setChieuRong(scanner.nextInt());
        hinhChuNhat.thongTin();
        
    }
}
