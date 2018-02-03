package HometaskNumberSix.Six;

import HometaskNumberSix.five.Rectangle;

public class ShareUtils {

    public static boolean rectangleOrNot(Figure figure){
        return figure instanceof Rectangle;
    }

    public static boolean triangleOrNot(Figure figure){
        return figure instanceof EquilateralTriangle;
    }
}
