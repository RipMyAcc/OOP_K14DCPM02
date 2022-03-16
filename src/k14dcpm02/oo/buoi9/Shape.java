package k14dcpm02.oo.buoi9;

abstract public class Shape {
    protected int x, y;
    Shape (int __x, int _y){
        x=__x;
        y=_y;

    }
    abstract public void draw();
    abstract public void erase();
    public void moveTo (int _x, int _y){
        erase();
        x=_x;
        y=_y;
        draw();
    }
}
