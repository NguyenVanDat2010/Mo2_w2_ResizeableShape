package shape;

import colorable.Colorable;
import resizeable.Resizeable;

public class Square extends Rectangle implements Colorable {
    private double side = 1;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
//        setSide(width);           //Sai
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
//        setSide(length);          //Sai
    }

    @Override
    public void resize(double percent) {
        double side=getWidth()+getWidth() * (percent/100);
        System.out.println("Square tăng tỷ lệ % lên " + side);
    }

    @Override
    public String toString() {
        return "A square with side = " + getSide() + ", which is a subclass of " + super.toString();
    }

    @Override
    public void howToColor(){
        System.out.println("Color all four sides.");
    }
}
