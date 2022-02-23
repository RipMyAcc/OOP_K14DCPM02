package k14dcpm02.oo.buoi3.shape;

public class Shape {
    private String sound;
    public Shape(){};
    public Shape(String sound){
        this.sound=sound;
    }
    public void setSound(String sound) {
        this.sound = sound;
    }
    public String getSound() {
        return sound;
    }
    public void rotate(){
        System.out.println("Rotating 360");
    }
    public void playSound(){
        System.out.println("Play sound.aif: "+sound+ " music");
    }

}
