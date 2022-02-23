package k14dcpm02.oo.buoi6;

public class CarTestDrive {
    public static void main(String[] args) {
        Car car = new Car();
        car.setCarColor("Crimson");
        car.setCarPrice(999999.99);
        System.out.println("Car's color: "+car.getCarColor());
        System.out.println("Car's price: "+car.getCarPrice());
    }
}
