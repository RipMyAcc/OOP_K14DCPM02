package k14dcpm02.oo.buoi3.shape;

public class ShapeTestDrive {
    public static void main(String[] args) {
        System.out.println("Circle");
        Circle circle=new Circle();
        circle.rotate();
        circle.playMusic();
        System.out.println();

        System.out.println("Square");
        Square square=new Square();
        square.rotate();
        square.playMusic();
        System.out.println();

        System.out.println("Triangle");
        Triangle triangle=new Triangle();
        triangle.rotate();
        triangle.playMusic();
    }
}
