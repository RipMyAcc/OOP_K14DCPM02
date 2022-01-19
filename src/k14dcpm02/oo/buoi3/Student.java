package k14dcpm02.oo.buoi3;

public class Student {
    String name;
    int age;
    String mssv;
    String lop;

    public Student(){
        
    }
    public Student(String name){
        this.name=name;
    }
    public Student(String name, int age){
        this(name);
        this.age=age;
    }
    public Student(String name, int age, String mssv){
        this(name, age);
        this.mssv=mssv;
    }
    public Student(String name, int age, String mssv, String lop){
        this(name, age, mssv);
        this.lop=lop;
    }
    void hoc(){
        System.out.println("Hoc ...");
        
    }

    void doc(){
        System.out.println("Doc sach ...");
    }

    void thi(/**this */){
        System.out.println("Thi ...");
        this.mssv = "";
    }

    void hoatDongNgoaiKhoa(){
        
    }
}
