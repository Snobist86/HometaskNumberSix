package HometaskNumberSix.Six;

import HometaskNumberSix.five.Point;

public class EquilateralTriangle extends Polygon {
    private static final int TOTALSIDE_TRIANGLE = 3;

    public EquilateralTriangle() {
        super();
    }

    public EquilateralTriangle(Point pointOne, Point pointTwo) {
        super(pointOne, pointTwo, TOTALSIDE_TRIANGLE);
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
        return "EquilateralTriangle{" +
                "pointOne = " + getPointOne() +
                ", pointTwo = " + getPointTwo() +
                ", totalSide = " + TOTALSIDE_TRIANGLE +
                '}';
    }

    @Override
    public void print() {
        String text = String.format("\nРавносторонний треугольник со стороной %.2f " +
                        "\nПериметр треугольника = %.2f \nПлощадь треугольника = %.2f\n",
                getPointOne().distance(getPointTwo()), perimeter(), area());
        System.out.printf(text);
    }
}
