package HometaskNumberSix.Six;

import HometaskNumberSix.five.Point;

public class Pentagon extends Polygon {
    private static final int TOTALSIDE_PENTAGON = 5;

    public Pentagon() {
        super();
    }

    public Pentagon(Point pointOne, Point pointTwo) {
        super(pointOne, pointTwo, TOTALSIDE_PENTAGON);
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
        return "Pentagon{" +
                "pointOne=" + getPointOne() +
                ", pointTwo=" + getPointTwo() +
                ", totalSide = " + TOTALSIDE_PENTAGON +
                '}';
    }

    public void print() {
        String text = String.format("\nПентагон со стороной %.2f \nПериметр пентагона = %.2f" +
                "\nПлощадь пентагона = %.2f\n", getPointOne().distance(getPointTwo()), perimeter(), area());
        System.out.printf(text);
    }
}
