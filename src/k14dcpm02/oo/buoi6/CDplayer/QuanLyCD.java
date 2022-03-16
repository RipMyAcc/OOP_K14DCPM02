package k14dcpm02.oo.buoi6.CDplayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyCD {
    List<CD> qlcd = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    protected void inputCD(){
        while(true){
            CD cd = new CD();
            cd.input();
            qlcd.add(cd);
            System.out.println("Them CD(y/n)? :");
            if(sc.nextLine().equals("n")){
                break;
            }
        }
    }

    protected void outputCD(){
        for(CD cd: qlcd){
            cd.output();
        }
    }

    
    protected void countAmountCD(){
        System.out.println("So luong CD: "+qlcd.size());
    }
}