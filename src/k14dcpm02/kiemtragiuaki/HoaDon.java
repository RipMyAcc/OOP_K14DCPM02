package k14dcpm02.kiemtragiuaki;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class HoaDon {
    private int maHoaDon;
    private Date ngayHoaDon;
    private String tenKhachHang;
    private int maPhong;
    private double donGia;


    public HoaDon(){

    }

    public HoaDon(int maHoaDon, Date ngayHoaDon, String tenKhachHang, int maPhong, double donGia){

    }


    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }
    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public int getMaPhong() {
        return maPhong;
    }
    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public Date getNgayHoaDon() {
        return ngayHoaDon;
    }
    public void setNgayHoaDon(Date ngayHoaDon) {
        this.ngayHoaDon = ngayHoaDon;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }
    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }



    @Override
    public String toString() {

        SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd/MM/yyyy");

        return "Mã hoá đơn: "+maHoaDon+" Ngày hoá đơn: "+ngayVietNam.format(ngayHoaDon)+" Tên khách hàng: "+tenKhachHang+
        " Mã phòng: "+maPhong+" Đơn giá: "+donGia;
    }
}
