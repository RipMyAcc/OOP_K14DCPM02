package k14dcpm02.oo.buoi3.shape;

public class ShapeTestDrive {
    public static void main(String[] args) {

        System.out.println("Circle");
        Circle circle=new Circle();
        circle.setSound("circle.aif");
        circle.rotate();
        circle.playSound();

        System.out.println("Square");
        Square Square=new Square();
        Square.setSound("Square.aif");
        Square.rotate();
        Square.playSound();
        
        System.out.println("Triangle");
        Triangle Triangle=new Triangle();
        Triangle.setSound("Triangle.aif");
        Triangle.rotate();
        Triangle.playSound();

        System.out.println("Amoeba");
        System.out.println("Testing Amoeba ...");
        Amoeba amoeba = new Amoeba();
        amoeba.setxPoint(5);
        amoeba.setyPoint(10);
        amoeba.setSound("amoebaMusic.hif");
        amoeba.rotate();
        amoeba.playSound();
        /*
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
        */
    }

}
