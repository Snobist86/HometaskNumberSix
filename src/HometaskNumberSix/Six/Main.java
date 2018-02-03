package HometaskNumberSix.Six;

import HometaskNumberSix.five.Point;
import HometaskNumberSix.five.Rectangle;

public class Main {

    public static void main(String[] args) {
        Point pointOne = new Point(0, 0);
        Point pointTwo = new Point(0, 5);
        Line radius = new Line(pointOne, pointTwo);

        Circle circle = new Circle(pointOne, pointTwo);
        circle.print();
        System.out.println(circle.toString());

        Circle krug = new Circle(new Point(0, 1), new Point(5, 6));
        krug.print();

        System.out.println("Равенство двух фигур: " + krug.compareAreas(circle));

        FourSquare fourSquare = new FourSquare(pointOne, pointTwo);
        fourSquare.print();

        EquilateralTriangle triangle = new EquilateralTriangle(pointOne, pointTwo);
        triangle.print();

        Pentagon pentagon = new Pentagon(pointOne, pointTwo);
        pentagon.print();

        Hexagon hexagon = new Hexagon(pointOne, pointTwo);
        hexagon.print();

        Polygon decagon = new Polygon(pointOne, pointTwo, 10);
        decagon.print();

        Rectangle rectangle = new Rectangle(pointOne, new Point(5,5));
        rectangle.print();

        System.out.println();
        System.out.println(ShareUtils.rectangleOrNot(rectangle));
        System.out.println(ShareUtils.triangleOrNot(rectangle));
    }

}
