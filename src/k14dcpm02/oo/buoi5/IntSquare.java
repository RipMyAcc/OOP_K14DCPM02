package k14dcpm02.oo.buoi5;

public class IntSquare {
    private  int squareValue;

    int getSquare(int value){
        this.squareValue = this.calculateSquare(value);
        return this.squareValue;
    }


    //implementation
    private int calculateSquare(int value){
        return (int)Math.pow(value, 2);//tuong lai = n lan thay doi
    }
}
