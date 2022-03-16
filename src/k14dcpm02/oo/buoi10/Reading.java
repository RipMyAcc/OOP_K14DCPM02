package k14dcpm02.oo.buoi10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

import k14dcpm02.oo.buoi6.ThucPham.HangThucPham;

public class Reading {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        FileInputStream fileInputStream = new FileInputStream("htp.dat");

        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        HangThucPham hangThucPham = (HangThucPham) objectInputStream.readObject();

        System.out.println(hangThucPham);
    }
}
