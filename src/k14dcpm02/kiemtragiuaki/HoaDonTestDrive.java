package k14dcpm02.kiemtragiuaki;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HoaDonTestDrive {
    static List<HoaDon> listHoaDon = new ArrayList<>();

    static Scanner so = new Scanner(System.in);
    static Scanner chu = new Scanner(System.in);

    static SimpleDateFormat ngayVN = new SimpleDateFormat("dd/mm/yyyy");
    public static void main(String[] args) throws ParseException{
        nhapThongTin();
        
        
    }
    static void nhapThongTin() throws ParseException{
        System.out.println("Nhập số lượng hoá đơn theo giờ: ");
            int soLuongHoaDonGio = so.nextInt();
            System.out.println("Nhập số lượng hoá đơn theo ngày: ");
            int soLuongHoaDonNgay = so.nextInt();

            for(int i=0; i<soLuongHoaDonGio; i++){
                HoaDonTheoGio hoaDonTheoGio = new HoaDonTheoGio();

                System.out.println("Nhập mã hoá đơn: ");
                hoaDonTheoGio.setDonGia(so.nextInt());

                System.out.println("Nhập ngày hoá đơn: ");
                hoaDonTheoGio.setNgayHoaDon(ngayVN.parse(chu.nextLine()));

                System.out.println("Nhập tên khách hàng: ");
                hoaDonTheoGio.setTenKhachHang(chu.nextLine());
                
                System.out.println("Nhập mã phòng: ");
                hoaDonTheoGio.setMaPhong(so.nextInt());

                System.out.println("Nhập đơn giá: ");
                hoaDonTheoGio.setDonGia(so.nextDouble());

                System.out.println("Nhập số giờ thuê: ");
                hoaDonTheoGio.setSoGioThue(so.nextInt());

                if(hoaDonTheoGio.getSoGioThue()>24 && hoaDonTheoGio.getSoGioThue()<30){
                    hoaDonTheoGio.setThanhTien(24*hoaDonTheoGio.getDonGia());
                    listHoaDon.add(hoaDonTheoGio);
                }
                else if (hoaDonTheoGio.getSoGioThue()>29){
                    System.out.println("Không sử dụng hoá đơn theo giờ");
                }
                else {
                    hoaDonTheoGio.setThanhTien(hoaDonTheoGio.getSoGioThue()*hoaDonTheoGio.getDonGia());
                    listHoaDon.add(hoaDonTheoGio);
                }
                
            }

            for(int i=0; i<soLuongHoaDonNgay; i++){
                HoaDonTheoNgay hoaDonTheoNgay = new HoaDonTheoNgay();

                System.out.println("Nhập mã hoá đơn: ");
                hoaDonTheoNgay.setDonGia(so.nextInt());

                System.out.println("Nhập ngày hoá đơn: ");
                hoaDonTheoNgay.setNgayHoaDon(ngayVN.parse(chu.nextLine()));

                System.out.println("Nhập tên khách hàng: ");
                hoaDonTheoNgay.setTenKhachHang(chu.nextLine());
                
                System.out.println("Nhập mã phòng: ");
                hoaDonTheoNgay.setMaPhong(so.nextInt());

                System.out.println("Nhập đơn giá: ");
                hoaDonTheoNgay.setDonGia(so.nextDouble());

                System.out.println("Nhập số giờ thuê: ");
                hoaDonTheoNgay.setSoNgayThue(so.nextInt());

                listHoaDon.add(hoaDonTheoNgay);
            }
    }
    static void xuatThongTin(){
        for (HoaDon hoaDon : listHoaDon) {
            hoaDon.toString();
        }
    }
}
