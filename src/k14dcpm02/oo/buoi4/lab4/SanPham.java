package k14dcpm02.oo.buoi4.lab4;

import java.util.Scanner;

public class SanPham {
    String tenSp;
    double donGia;
    double giamGia;

    SanPham(){
    }
    
    private double getThueNhapKhau(){
        double thue = donGia/10;
        return thue;
    }

    public SanPham(String tenSp, double donGia, double giamGia){ 
        this.tenSp = tenSp;
        this.donGia=donGia;
        this.giamGia=giamGia;
    }

    public SanPham(String tenSp, double donGia){
        this(tenSp, donGia, 0);
        }
        
        

    void nhap(){
        System.out.println("____Nhập sản phẩm____");
        Scanner kiTu=new Scanner(System.in);
        Scanner so=new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        tenSp=kiTu.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia=so.nextDouble();
        System.out.print("Nhập giảm giá: ");
        giamGia=so.nextDouble();
        System.out.println();
    }

    public void xuat(){
        System.out.println("____Xuất thông tin____");
        System.out.println("Tên sản phẩm: "+tenSp);
        System.out.println("Đơn giá: "+donGia);
        System.out.println("Giảm giá: "+giamGia);
        System.out.println("Thuế: "+getThueNhapKhau());
        System.out.println();
    }

}
