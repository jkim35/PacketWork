package Travel;

public class Travelrun {
    public static void main(String[]args){
        int i =0;
        do{
            Travel six = new Travel(6+(i*2));
            double v = six.goByVan();
            int p = six.goByPlane();
            int c = six.goByCanoe();
            int why = 6+(i*2);
            System.out.println("People = "+why+", vans = "+v+", canoes = "+c+", planes = "+p);
            i++;
        }while(i<18);
    } 
}
