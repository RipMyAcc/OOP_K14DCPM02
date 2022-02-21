package k14dcpm02.oo.buoi5;

public class Dog {
    private int size;
    private String breed;
    private String name;

    public void setSize(int size){
        if(size>0){
            this.size=size;
        }
        else{
            System.out.println("Invalid size !");
        }
        
    }
    public int getSize(){
        return this.size;
    }
    public void setBreed(String breed){
        this.breed=breed;
    }
    public String getBreed(){
        return breed;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
