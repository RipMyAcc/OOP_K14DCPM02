package k14dcpm02.oo.buoi9.book;

import java.util.Date;
import java.util.Scanner;

public abstract class Sach {
    private int maSach;
    private String ngayNhap;
    private double donGia;
    private int soLuong;
    private String nhaXuatBan;
    Scanner sc = new Scanner(System.in);
    Scanner scs = new Scanner(System.in);

    public Sach(){
        super();
    }

    public Sach(int maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
        this.maSach = maSach;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaXuatBan = nhaXuatBan;
    }


    public int getMaSach() {
        return this.maSach;
    }

    public int setMaSach() {
        System.out.println("Ma sach: ");
        return this.maSach = scs.nextInt();
    }

    public String getNgayNhap() {
        return this.ngayNhap;
    }

    public String setNgayNhap() {
        System.out.println("Ngay Nhap: ");
        return this.ngayNhap = sc.nextLine();
    }

    public double getDonGia() {
        return this.donGia;
    }

    public double setDonGia() {
        System.out.println("Don gia: ");
        return this.donGia = scs.nextDouble();
    }

    public int getSoLuong() {
        return this.soLuong;
    }

    public int setSoLuong() {
        System.out.println("So luong: ");
        return this.soLuong = scs.nextInt();
    }

    public String getNhaXuatBan() {
        return this.nhaXuatBan;
    }

    public String setNhaXuatBan() {
        System.out.println("Nha XB: ");
        return this.nhaXuatBan = sc.nextLine();
    }

    public void nhapThongTin(){
        this.setMaSach();
        this.setNgayNhap();
        this.setDonGia();
        this.setSoLuong();
        this.setNhaXuatBan();
    }

    @Override
    public String toString() {
        return "Ma sach: "+this.getMaSach()+" Ngay nhap: "+this.getNgayNhap()+
        " Don gia: "+this.getDonGia()+" So luong: "+this.getSoLuong()+" Nha XB: "+this.getNhaXuatBan();
    }

    public void inThongTinSGK() {
    }

    public void nhapThongTinSGK() {
    }

    public void tinhTongThanhTienSGK() {
    }


}