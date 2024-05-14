package Circle;

public class CircleRunner {
    public static void main(String[]args){
        Circle wow = new Circle(3);
        double qwi = wow.getCircumference();
        System.out.println(qwi+"sq.in");
        double v = wow.getArea();
        System.out.println(v+" sq.in.");
        wow.changeR(1);
        double wq = wow.getArea();
        System.out.println(wq+" sq.in.");
    }
}
