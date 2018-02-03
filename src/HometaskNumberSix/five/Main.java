package HometaskNumberSix.five;

public class Main {

    public static void main(String[] args) {

        Point pointOne = new Point(8,8);
        Point pointTwo = new Point(5, 5);
        Rectangle figure = new Rectangle(pointOne, pointTwo);

        System.out.printf("Diagonal of the rectangle is %.2f", figure.getDiagonal());
        System.out.printf("\nSquare of the rectangle is %.2f", figure.area());


    }
}
