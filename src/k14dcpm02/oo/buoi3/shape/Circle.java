package k14dcpm02.oo.buoi3.shape;

public class Circle {
    String fileSound="Circle.eif";

    Circle(){

    }
    Circle(String fileSound){
        this.fileSound=fileSound;
    }

    void rotate(){
        System.out.println("Rotate360");
    }
    void playMusic(){
        System.out.println(this.fileSound);
    }
}
