import java.util.Scanner;

public class JavaSlotMachine {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        double balance =100;
        double bet;
        double payout;

        String[] row;

        System.out.println(" Welcome to the slot machine");

        while(balance > 0){
            System.out.println("Your current balance: $"+balance);
            System.out.print("Enter your bet amount: $");
            bet = scanner.nextDouble();
            if(bet > balance){
                System.out.println("INSUFFICIENT FUNDS");
            }
            else if(bet<0){
                System.out.println("Bet can't be less than 0");
            }
            else {
                balance -= bet;
                System.out.println(balance);
            }

            System.out.print("Dou you want to play again (Y/N): ");
            String response = scanner.nextLine().toUpperCase();
            if(!response.equals("Y")){
                break;
            }

        }
        //variable declaration
        //balance 
        //payout
        //display welcome
       
        //symbols of array
        //balance should be >0
        //enter bet amount
            // verify bet >balance
            // bet >0
            //subtract bet from balance
        //spin row
        //print row
        //get payout
        //play again
        //exit message
        


        System.out.println("Symbols: 🍒");
    }
}
