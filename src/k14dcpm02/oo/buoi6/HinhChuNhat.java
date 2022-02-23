package k14dcpm02.oo.buoi6;

public class HinhChuNhat {
    private int chieuDai;
    private int chieuRong;

    public int getChieuDai(){
        return chieuDai;
    }

    public int getChieuRong(){
        return chieuRong;
    }

    public void setChieuDai(int chieuDai){
        this.chieuDai=chieuDai;
    }

    public void setChieuRong(int chieuRong){
        this.chieuRong=chieuRong;
    }

    public int dienTich(){
        return chieuDai*chieuRong;
    }

    public int chuVi(){
        return (chieuDai+chieuRong)*2;
    }

    public void thongTin(){
        System.out.println("Chiều dài: "+chieuDai);
        System.out.println("Chiều rộng: "+chieuRong);
        System.out.println("Chu vi: "+chuVi());
        System.out.println("Diện tích: "+dienTich());
    }

}
