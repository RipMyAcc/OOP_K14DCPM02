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
        System.out.println();

        System.out.println("Amoeba");
        Amoeba amoeba =new Amoeba();
        triangle.rotate();
        triangle.playMusic();
        System.out.println();


        System.out.println("Circle");
        circle=new Circle("funCircle.elf");
        circle.rotate();
        circle.playMusic();
        System.out.println();

        System.out.println("Square");
        square=new Square("funSquare.elf");
        square.rotate();
        square.playMusic();
        System.out.println();

        System.out.println("Triangle");
        triangle=new Triangle("funTriangle.elf");
        triangle.rotate();
        triangle.playMusic();

        System.out.println("Amoeba");
        amoeba =new Amoeba("sadAmorba.hif");
        triangle.rotate();
        triangle.playMusic();
        System.out.println();
    }
}
