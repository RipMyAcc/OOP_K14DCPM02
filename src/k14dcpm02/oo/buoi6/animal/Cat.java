package k14dcpm02.oo.buoi6.animal;

public class Cat extends Felines{
    @Override
    protected void eat(){
        System.out.println("Cat eating cat food");
    }

    @Override
    protected void makeNoise(){
        System.out.println("Cat Sound");
    }

    public void chaseButterfly(){
        System.out.println("chaseButterfly...........");
    }
}
