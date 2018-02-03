package HometaskNumberSix.Six;

import HometaskNumberSix.five.Point;

public class Polygon extends Figure implements GeometricParameters {

    private Point pointOne;
    private Point pointTwo;
    private int totalSide;


    public Polygon(Point pointOne, Point pointTwo, int totalSide) {
        this.pointOne = pointOne;
        this.pointTwo = pointTwo;
        this.totalSide = totalSide;
    }

    public Polygon(Point pointOne, Point pointTwo) {
        this.pointOne = pointOne;
        this.pointTwo = pointTwo;
    }

    public Polygon() {
    }

    public double perimeter() {
        return getPointOne().distance(getPointTwo()) * totalSide;
    }

    public double area() {
        final double Pi = Math.PI;
        double radiusCircle; // Радиус вписанной окружности (высота)
        radiusCircle = sideLenght() / (2 * Math.tan(Pi / totalSide));

        return perimeter() / 2 * radiusCircle;
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "pointOne=" + pointOne +
                ", pointTwo=" + pointTwo +
                ", totalSide=" + totalSide +
                '}';
    }

    @Override
    public void print() {
        String text = String.format("\nМногоугольник со сторонами %.2f \nПериметр многоульника = %.2f " +
                "\nПлощадь многоугольника = %.2f\n", getPointOne().distance(getPointTwo()), perimeter(), area());
        System.out.printf(text);
    }

    public double sideLenght() {
        return this.pointOne.distance(this.pointTwo);
    }

    public Point getPointOne() {
        return pointOne;
    }

    public void setPointOne(Point pointOne) {
        this.pointOne = pointOne;
    }

    public Point getPointTwo() {
        return pointTwo;
    }

    public void setPointTwo(Point pointTwo) {
        this.pointTwo = pointTwo;
    }

    public int getTotalSide() {
        return totalSide;
    }

    public void setTotalSide(int totalSide) {
        this.totalSide = totalSide;
    }
}
