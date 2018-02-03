package HometaskNumberSix.five;

public class Point {

    private int coordinateX;
    private int coordinateY;

    public Point(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    private double getValue(int valueOne, int valueTwo) {
        return Math.abs(valueOne - valueTwo);
    }

    public double getLenght(Point point){
        return getValue(getCoordinateX(), point.getCoordinateX());
    }

    public double getHeight(Point point){
        return getValue(getCoordinateY(), point.getCoordinateY());
    }

    public double distance (Point point) {
        double length = getLenght(point);
        double height = getHeight(point);

        return Math.sqrt((Math.pow(length, 2) + Math.pow(height, 2)));
    }

    public void print() {
        System.out.println("Координата Х: " + coordinateX + "\nКоордината Y: " + coordinateY);
    }

    @Override
    public String toString() {
        return "X " + coordinateX +
                ", Y " + coordinateY;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

}
