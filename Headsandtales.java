import java.util.Random;

public class Headsandtales {
    public static void main(String []args){
        Random random = new Random();
        boolean isHeads = random.nextBoolean();
        if(isHeads){
            System.out.println("Heads");
        }
        else{
            System.out.println("Tails");
        }
        
    }
}
