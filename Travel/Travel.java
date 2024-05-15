package Travel;

public class Travel {
    private int people;
    public Travel(int n){
        people = n;
    }
    public int goByVan(){
        int remainderV = people%8;
        int v = (int) Math.ceil((people-remainderV)/8);
        if (v%8<5){
            v++;
        }
        return v;
    }
    public int goByPlane(){
        int remainderP = people%12;
        int p = ((people-remainderP)/12);
        if (p==0){
            p++;
        }
        return p;
    }
    public int goByCanoe(){
        int remainderC = people%3;
        int c = ((people-remainderC)/3);
        if (c==0){
            c++;
        }
        return c;
    }
}
