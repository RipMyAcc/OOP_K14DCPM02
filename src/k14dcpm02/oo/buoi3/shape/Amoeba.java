package k14dcpm02.oo.buoi3.shape;

public class Amoeba extends Shape{
    private double xPoint;
    private double yPoint;
    public Amoeba(){}
    public void setxPoint(double xPoint) {
        this.xPoint = xPoint;
    }
    public void setyPoint(double yPoint) {
        this.yPoint = yPoint;
    }
    @Override
    public void setSound(String sound) {
        super.setSound(sound);
    }
    public Amoeba(String sound, double xPoint, double yPoint){
        this.xPoint = xPoint;
        this.yPoint = yPoint;
    }
    @Override
    public void rotate() {
        System.out.println("Rotating 360 at xPoint: " + this.xPoint + ", yPoint " + this.yPoint);
    }

    @Override
    public void playSound() {
        System.out.println("Play sound .hif: "+ this.getSound() + " music");
    }


    /*
    String fileSound="Ameba.hif";
    int xPoint;
    int yPoint;

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
    */
}
