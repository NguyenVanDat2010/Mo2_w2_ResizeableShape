package shape;

import resizeable.Resizeable;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double percent) {
        double radius = getRadius() + getRadius() * (percent / 100);
        System.out.println("Circle tăng tỷ lệ % lên " + radius);
    }

    @Override
    public String toString() {
        return "A circle with radius " + getRadius() + ", which is a subclass of " + super.toString();
    }
}
