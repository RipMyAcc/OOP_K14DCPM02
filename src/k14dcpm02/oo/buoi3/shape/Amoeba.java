package k14dcpm02.oo.buoi3.shape;

public class Amoeba {
    String fileSound="Ameba.hif";

    Amoeba(){

    }
    Amoeba(String fileSound){
        this.fileSound=fileSound;
    }

    void rotate(){
        System.out.println("Rotate360");
    }
    void playMusic(){
        System.out.println(this.fileSound);
    }
}
