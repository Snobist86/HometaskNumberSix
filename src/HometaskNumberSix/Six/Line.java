package HometaskNumberSix.Six;

import HometaskNumberSix.five.Point;

public class Line {
    private Point pointOne;
    private Point pointTwo;

    public Line(Point pointOne, Point pointTwo) {
        this.pointOne = pointOne;
        this.pointTwo = pointTwo;
    }

    public Line() {
    }

    public double trueLenght() {
        return pointOne.distance(pointTwo);
    }

    public void print() {
        String text = String.format("\nДлина линии = %.2f\n", trueLenght());
        System.out.printf(text);
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
}
