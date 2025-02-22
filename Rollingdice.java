import java.util.Random;
import java.util.Scanner;


public class Rollingdice{
    public static void main(String []args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        // here 1 is inclusive and 7 is exclusive
        // int randomnum = random.nextInt(1,7);
        // It is my Intial tiem where i have started coding in java again
        // So at first i have used simple logic using too much if else statements
        //Later i have used while loops and agin utilize do while
        // I can see progress
        // As i am already aware of while loops before i used it before revising the concepts
        System.out.print("How many turns do you want to play: ");
        int turns = scanner.nextInt();
        int i = 1 ;
        int result1 =0 , result2 = 0;
        int player1 =0, player2 =0;
 
        while(i <= turns){
            do{
                player1 = random.nextInt(1,7);
                System.out.println("Rolling dice for Player1 " +i+ " turn: "+player1);
                result1 += player1;
            } while(player1 % 6 == 0);

            do{
                player2 = random.nextInt(1,7);
                System.out.println("Rolling dice for Player2 " +i+ " turn: "+player2);
                result2 += player2;
            } while(player2 % 6 == 0);
                
            // int player1 = random.nextInt(1,7);
            // System.out.println("Rolling dice for Player1 " +i+ " turn: "+player1);
            // result1 += player1;
            // int player2 = random.nextInt(1,7);
            // System.out.println("Rolling dice for Player2 " +i+ " turn: "+player2);
            // result2 += player2;

            // if(player1 == 6){
            // player1 = random.nextInt(1,7);
            // System.out.println("Bonus rolling dice for Player1: "+player1);
            // result1 += player1;
            // }
            // else if(player2 ==6 ){
            // player2 = random.nextInt(1,7);
            // System.out.println("Bonus rolling dice for Player2: "+player2);
            // result2 += player2;
            // }
            
            i++;
        }
        if(result1 > result2){
            System.out.println("Player1 Win!!!");
            System.out.println(result1);
        }
        else if(result1 < result2){
            System.out.println("Player2 Win!!!");
            System.out.println(result2);
        }
        else {
            System.out.println("Its Draw :(");
        }
        
     scanner.close();
    }
}