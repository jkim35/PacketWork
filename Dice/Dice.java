package Dice;

public class Dice {
    private int die1, die2;
    public Dice(){
        die1 = (int)(6*Math.random())+1;
        die2 = (int)(6*Math.random())+1;
    }
    public void roll(){
        die1 = (int)(6*Math.random())+1;
        die2 = (int)(6*Math.random())+1;
    }
    public int getTotal(){
        int total = die1+die2;
        return total;
    }
}
