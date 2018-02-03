package HometaskNumberSix.Six;

import HometaskNumberSix.five.Point;

public class Circle extends Figure implements GeometricParameters {

    private Point centre;
    private Point pointOnCircle;

    public Circle(Point centre, Point pointOnCircle) {
        this.centre = centre;
        this.pointOnCircle = pointOnCircle;

    }

    public Circle() {
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * calcRadius();
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(calcRadius(), 2);
    }

    public double calcRadius() {
        return this.centre.distance(this.pointOnCircle);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "centre: " + centre +
                " pointOnCircle: " + pointOnCircle +
                ", radius = " + String.format("%.3f", calcRadius()) + "}";
    }

    public void print() {
        String text = String.format("\nОкружность с центром в точке (%s, %s) и радиусом %.2f " +
                        "\nДлина окружности = %.2f \nПлощадь круга = %.2f \n",
                centre.getCoordinateX(), centre.getCoordinateY(), calcRadius(), perimeter(), area());
        System.out.printf(text);
    }

    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public Point getPointOnCircle() {
        return pointOnCircle;
    }

    public void setPointOnCircle(Point pointOnCircle) {
        this.pointOnCircle = pointOnCircle;
    }

}
