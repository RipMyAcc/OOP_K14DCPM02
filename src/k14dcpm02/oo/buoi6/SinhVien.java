package k14dcpm02.oo.buoi6;

public class SinhVien {
    private int mssv;
    private String hoTen;
    private float toan;
    private float ly;
    private float hoa;
    SinhVien(){}
    SinhVien(int mssv, String hoTen, float toan, float ly, float hoa){
        this.mssv=mssv;
        this.hoTen=hoTen;
        this.toan=toan;
        this.ly=ly;
        this.hoa=hoa;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public void setMssv(int mssv) {
        this.mssv = mssv;
    }
    public void setToan(float toan) {
        this.toan = toan;
    }
    public void setLy(float ly) {
        this.ly = ly;
    }
    public void setHoa(float hoa) {
        this.hoa = hoa;
    }
    public String getHoTen() {
        return hoTen;
    }
    public int getMssv() {
        return mssv;
    }
    public float getToan() {
        return toan;
    }
    public float getLy() {
        return ly;
    }
    public float getHoa() {
        return hoa;
    }
    public float tinhDiemTrungBinh(){
        return (toan+ly+hoa)/3;
    }
    public String toString() {
        String str="MSSV: "+mssv+", Ho ten: "+hoTen+", Toan: "+toan+", Ly: "+ly+", Hoa: "+hoa+", Diem trung binh: "+tinhDiemTrungBinh();
        return str;
    }
}
