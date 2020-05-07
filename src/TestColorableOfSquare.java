import colorable.Colorable;
import shape.Circle;
import shape.Rectangle;
import shape.Shape;
import shape.Square;

public class TestColorableOfSquare {
    public static void main(String[] args) {
        Shape[]shapes=new Shape[3];
        shapes[0]=new Circle(5);
        shapes[1]=new Rectangle(3,3);
        shapes[2]=new Square(6);

//        for (int i=0;i<shapes.length;i++){
//            if (shapes[i] instanceof Circle){
//                Circle circle=(Circle) shapes[i];
//                System.out.println(circle.getArea());
//            }else if (shapes[i] instanceof Colorable){
//                Colorable square = (Colorable) shapes[i];
//                square.howToColor();
//            }else {
//                Rectangle rectangle=(Rectangle)shapes[i];
//                System.out.println(rectangle.getArea());
//            }
//        }

        for (int i=0;i<shapes.length;i++){
            if (shapes[i] instanceof Colorable){
                Colorable colorable=(Colorable)shapes[i];
                colorable.howToColor();
            }else {
                System.out.println(shapes[i].getArea());
            }
        }
    }
}
