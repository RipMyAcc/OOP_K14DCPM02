package k14dcpm02.kiemtragiuaki;

public class HoaDonTheoGio extends HoaDon{
    private int soGioThue;
    private double thanhTien;

    public int getSoGioThue() {
        return soGioThue;
    }
   public void setSoGioThue(int soGioThue) {
       this.soGioThue = soGioThue;
   }

   public void setThanhTien(double thanhTien) {
       this.thanhTien = thanhTien;
   }

    @Override
    public String toString() {
        return super.toString()+" Số giờ thuê: "+soGioThue+" Thành tiền: "+thanhTien;
    }
}
