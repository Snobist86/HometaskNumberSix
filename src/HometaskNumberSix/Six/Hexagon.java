package HometaskNumberSix.Six;

import HometaskNumberSix.five.Point;

public class Hexagon extends Polygon {

    private static final int TOTALSIDE_HEXAGON = 6;

    public Hexagon() {
        super();
    }

    public Hexagon(Point pointOne, Point pointTwo) {
        super(pointOne, pointTwo, TOTALSIDE_HEXAGON);
    }

    @Override
    public double perimeter() {
        return super.perimeter();
    }

    @Override
    public double area() {
        return super.area();
    }

    @Override
    public String toString() {
        return "Hexagon{" +
                "pointOne=" + getPointOne() +
                ", pointTwo=" + getPointTwo() +
                ", totalSide = " + TOTALSIDE_HEXAGON +
                '}';
    }

    public void print() {
        String text = String.format("\nГексагон со стороной %.2f \nПериметр гексагона = %.2f" +
                "\nПлощадь гексагона = %.2f\n", getPointOne().distance(getPointTwo()), perimeter(), area());
        System.out.printf(text);
    }
}
