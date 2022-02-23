package k14dcpm02.oo.buoi6;

import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class SinhVienTestDrive {
    public static void main(String[] args) {
        Scanner kiTu =new Scanner(System.in);
        Scanner so=new Scanner(System.in);
        SinhVien sv1=new SinhVien(2004110042, "Nguyen Phu", 7, 7, 7);
        SinhVien sv2=new SinhVien(2004110046, "Nguyen Thanh Dat", 7, 8, 9);
        SinhVien sv3=new SinhVien();
        System.out.println("Nhap MSSV cho sinh vien 3: ");
        sv3.setMssv(so.nextInt());
        System.out.println("Nhap ten cho sinh vien 3: ");
        sv3.setHoTen(kiTu.nextLine());
        System.out.println("Nhap diem toan cho sinh vien 3: ");
        sv3.setToan(so.nextFloat());
        System.out.println("Nhap diem ly cho sinh vien 3: ");
        sv3.setLy(so.nextFloat());
        System.out.println("Nhap diem hoa cho sinh vien 3: ");
        sv3.setHoa(so.nextFloat());
        System.out.printf("MSSV: %d, Ho ten: %-20s, Toan: %.2f Ly: %.2f, Hoa: %.2f, Diem trung binh: %.2f \n",sv1.getMssv(),sv1.getHoTen(),sv1.getToan(),sv1.getLy(),sv1.getHoa(),sv1.tinhDiemTrungBinh());
        System.out.printf("MSSV: %d, Ho ten: %-20s, Toan: %.2f Ly: %.2f, Hoa: %.2f, Diem trung binh: %.2f \n",sv2.getMssv(),sv2.getHoTen(),sv2.getToan(),sv2.getLy(),sv2.getHoa(),sv2.tinhDiemTrungBinh());
        System.out.printf("MSSV: %d, Ho ten: %-20s, Toan: %.2f Ly: %.2f, Hoa: %.2f, Diem trung binh: %.2f \n",sv3.getMssv(),sv3.getHoTen(),sv3.getToan(),sv3.getLy(),sv3.getHoa(),sv3.tinhDiemTrungBinh());
    }
}
