package k14dcpm02.oo.buoi3;

public class StudentTestdrive {
    public static void main(String[] args) {
        

        Student taiStudent = new Student();


        taiStudent.hoc();
        taiStudent.thi();


        Student thachStuden = new Student();
        thachStuden.doc();
        thachStuden.hoatDongNgoaiKhoa();



        Student trungStudent = new Student();
        trungStudent.hoatDongNgoaiKhoa();
        trungStudent.hoc();


        Student trongStudent = new Student("Trọng", 20, "003", "dhpm02");
        trongStudent.thi();

    }
}
