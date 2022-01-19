package k14dcpm02.oo.buoi3.shape;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Circle circle=new Circle(3);
        circle.spin();
        circle.playMusic();

        Square square=new Square(4);
        square.spin();
        square.playMusic();

        Triangle triangle=new Triangle(5);
        triangle.spin();
        triangle.playMusic();
    }
}
