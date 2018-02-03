package HometaskNumberSix.five;

import HometaskNumberSix.Six.Figure;

public class Rectangle extends Figure {
    private Point pointLeftUp;
    private Point pointRightDown;

    public Rectangle(Point pointLeftUp, Point pointRightDown) {
        this.pointLeftUp = pointLeftUp;
        this.pointRightDown = pointRightDown;
    }

    public double getDiagonal() {
        return pointLeftUp.distance(pointRightDown);
    }

    @Override
    public double area() {
        return pointLeftUp.getLenght(pointRightDown) * pointLeftUp.getHeight(pointRightDown);
    }

    @Override
    public double perimeter() {
        return 2 * (pointLeftUp.getLenght(pointRightDown) + pointLeftUp.getHeight(pointRightDown));
    }

    @Override
    public void print() {
        String text = String.format("\nПрямоугольник со сторонами %.2f и %.2f " +
                        "\nПериметр прямокгольника = %.2f \nПлощадь прямоугольника = %.2f\n",
                         pointLeftUp.getLenght(pointRightDown), pointLeftUp.getHeight(pointRightDown),
                         perimeter(), area());
        System.out.printf(text);
    }

    public Point getPointLeftUp() {
        return pointLeftUp;
    }

    public void setPointLeftUp(Point pointLeftUp) {
        this.pointLeftUp = pointLeftUp;
    }

    public Point getPointRightDown() {
        return pointRightDown;
    }

    public void setPointRightDown(Point pointRightDown) {
        this.pointRightDown = pointRightDown;
    }
}