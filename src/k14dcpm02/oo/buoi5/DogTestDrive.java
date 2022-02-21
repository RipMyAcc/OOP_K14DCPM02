package k14dcpm02.oo.buoi5;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setSize(4);
        System.out.println("Size of dog: "+dog.getSize());
        dog.setBreed("Bum Dog");
        System.out.println("Breed of dog: "+dog.getBreed());
        dog.setName("Ale");
        System.out.println("Name of dog: "+dog.getName());
        
    }
}
