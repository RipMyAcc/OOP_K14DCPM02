package k14dcpm02.oo.buoi6.animal;

public class AnimalTestDrive {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat();
        lion.makeNoise();
        lion.sleep();
        lion.roam();

        Wolf wolf = new Wolf();
        wolf.eat();
        wolf.makeNoise();
        wolf.roam();
    }
}
