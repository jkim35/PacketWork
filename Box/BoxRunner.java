package Box;

public class BoxRunner {
    public static void main(String[]args){
        Box idk = new Box(2,6);
        double v = idk.getArea();
        System.out.println(v+" cu.in.");
        idk.bigger(2);
        double p = idk.getPerimeter();
        System.out.println(p+" cu.in.");
    } 
}
