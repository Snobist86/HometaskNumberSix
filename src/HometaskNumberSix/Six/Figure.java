package HometaskNumberSix.Six;

public abstract class Figure implements GeometricParameters {

    public boolean compareAreas (Figure figureOne){
        return (figureOne.area() == this.area())? true: false;
    }
}
