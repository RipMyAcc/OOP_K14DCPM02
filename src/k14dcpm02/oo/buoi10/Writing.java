package k14dcpm02.oo.buoi10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

import k14dcpm02.oo.buoi6.ThucPham.HangThucPham;

public class Writing {
    public static void main(String[] args) throws IOException {
        HangThucPham hangThucPham = new HangThucPham("01", "Mi", 3000, new Date(), new Date());

        FileOutputStream fileOutputStream = new FileOutputStream("htp.dat");
        
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(hangThucPham);

        objectOutputStream.close();

        

    }
}
