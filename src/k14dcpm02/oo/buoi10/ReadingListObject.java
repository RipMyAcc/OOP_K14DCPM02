/*
*  created date: Mar 16, 2022
*  author: cgm
*/
package k14dcpm02.oo.buoi10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import k14dcpm02.oo.buoi6.ThucPham.HangThucPham;

public class ReadingListObject {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream inFile = new FileInputStream("htp.dat");
        ObjectInputStream objIn = new ObjectInputStream(inFile);
        List<HangThucPham> list = (List) objIn.readObject();
        
        //chỉnh sửa, cập nhật thông tin của HangHoa

        for (HangThucPham hangThucPham : list) {
            System.out.println(hangThucPham);
        }
    }
    
}