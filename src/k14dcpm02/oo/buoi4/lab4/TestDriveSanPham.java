package k14dcpm02.oo.buoi4.lab4;

public class TestDriveSanPham {
    public static void main(String[] args) {
        SanPham sanPham1=new SanPham("Thịt bò", 22000); 
        sanPham1.xuat();

        SanPham sanPham2=new SanPham("Thịt heo", 20000, 1000);
        sanPham2.xuat();
    }
}
