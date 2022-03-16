package k14dcpm02.kiemtragiuaki;

public class HoaDonTheoNgay extends HoaDon{
    private int soNgayThue;
    private double thanhTien;

    public int getSoNgayThue() {
        return soNgayThue;
    }
    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    @Override
    public String toString() {
        return super.toString()+" Số ngày thuê: "+soNgayThue+" Thành tiền: "+thanhTien;
    }
}
