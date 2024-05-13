package Box;

public class Box {
    private double width,length;
    public Box (double a, double b){
        width = a;
        length = b;
    }
    public double getArea(){
        double vol = width*length;
        return vol;
    }
    public double getPerimeter(){
        double p = 2.0*(width+length);
        return p;
    }
    public void bigger(double f){
        length = f*length;
        width = f*width;
    }
}
