/*
*  created date: Mar 14, 2022
*  author: cgm
*/
package k14dcpm02.oo.buoi9;

public class IntSquareIml extends IntSquareAbstract {

    //implementation
    // private int calculateSquare(int value) {
       // return (int)Math.pow(value, 2);//tuong lai = n
        // return value * value;
    // }

    //implement taion
    @Override
    public int getSquare(int value) {
        return (int)Math.pow(value, 2);
        //return (int)Math.pow(value, 2);

    }

}