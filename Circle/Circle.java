package Circle;

public class Circle{
    private double radius;
    public Circle (double r){
        radius = r;
    }
    public double getArea(){
        double radiusSquared = radius*radius;
        double vol = radiusSquared*Math.PI;
        return vol;
    }
    public double getCircumference(){
        double circumfernece = radius*2*Math.PI;
        return circumfernece;
    }
    public void changeR(double r){
        radius = r;
    }
}

