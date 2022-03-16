/*
*  created date: Feb 21, 2022
*  author: cgm
*/
package k14dcpm02.oo.buoi5;

public class DogTestDrive {

    public static void main(String[] args) {
        Dog dog = new Dog();

        //dog.size = -1;// không đúng
        dog.setSize(5);

        System.out.println("Size of dog: " + dog.getSize());
        
    }
    
}