import shape.Circle;
import shape.Rectangle;

public class TestResizeableShape {
    public static void main(String[] args) {
        Circle circle=new Circle(5);
        circle.resize(9);

        Rectangle rectangle=new Rectangle(6,6);
        rectangle.resize(9);
    }
}
