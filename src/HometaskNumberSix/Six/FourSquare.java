package HometaskNumberSix.Six;

import HometaskNumberSix.five.Point;

public class FourSquare extends Polygon {
    private static final int TOTALSIDE_SQUARE = 4;

    public FourSquare() {
        super();
    }

    public FourSquare(Point pointOne, Point pointTwo) {
        super(pointOne, pointTwo, TOTALSIDE_SQUARE);
    }

    @Override
    public double perimeter() {
        return super.perimeter();
    }

    @Override
    public double area() {
        return super.area();
    }

//    @Override
//    public double area() {
//        return sideLenght() * sideLenght();
//    }

    @Override
    public String toString() {
        return "FourSquare{" +
                "pointOne = " + getPointOne() +
                ", pointTwo = " + getPointTwo() +
                ", totalSide = " + TOTALSIDE_SQUARE +
                '}';
    }

    public void print() {
        String text = String.format("\nКвадрат со стороной %.2f \nПериметр квадрата = %.2f" +
                        "\nПлощадь квадрата = %.2f\n",
                         getPointOne().distance(getPointTwo()), perimeter(), area());
        System.out.printf(text);
    }
}