package k14dcpm02.oo.buoi4.lab4;

public class TestDriveSanPham {
    public static void main(String[] args) {
        SanPham sanPham= new SanPham();
        sanPham.setTenSp("Thịt bò");
        sanPham.setdonGia(20000);
        sanPham.setgiamGia(1000);
        System.out.println("Tên sản phẩm: "+sanPham.getTenSp());
        System.out.println("Đơn giá: "+sanPham.getdonGia());
        System.out.println("Giảm giá: "+sanPham.getgiamGia());
        System.out.println("Thuế: "+sanPham.getThueNhapKhau());
        System.out.println(); 
        
    }
}
