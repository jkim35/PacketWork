package Dice;

public class DiceHundered {
    public static void main(String[]args){
        int i = 0;
        int seveneleven = 0;
        int twothreetwelve = 0;
        
        Dice d = new Dice();
        do{

            d.roll();
            int n = d.getTotal();
            if (n==7||n==11){
                seveneleven++;
            }
            if (n==2||n==3||n==12){
                twothreetwelve++;
            }
            i++;
        }while(i<100);
        System.out.println("You have rolled a 7 or 11 "+seveneleven+"% of the time.");
        System.out.println("You have rolled a 2, 3, or 12 "+twothreetwelve+"% of the time.");
    }
}
