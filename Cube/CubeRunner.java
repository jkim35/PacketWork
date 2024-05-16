package Cube;

public class CubeRunner {
    public static void main(String[]args){
        Cube cubical = new Cube(3);
        double V = cubical.volume();
        double SA = cubical.surfaceArea();
        System.out.println("The surface area is "+SA+" sq. units");
        System.out.println("The volume is "+V+" cu. units");
        cubical.setSideForVolume(125);
        double side = cubical.getSide();
        SA = cubical.surfaceArea();
        System.out.println("The side is now "+side+" units");
        System.out.println("The surface area is "+SA+" sq. units");
    }
}
