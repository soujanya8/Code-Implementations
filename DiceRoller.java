import java.util.Scanner;
import java.util.Random;

public class DiceRoller {
    public static void main(String []args){
        //Dice Roller
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int roll;
        int total = 0;

        System.out.print("Enter the number of Dice to roll: ");
        int diceCount = scanner.nextInt();
        while(diceCount >= 0){
            for(int i=1;i<=diceCount ; i++){
                roll =random.nextInt(1,7);
                printDie(roll);
                System.out.println("Rolling on dice"+i+": "+roll);
                total += roll;
            }
            System.out.println("Total is "+total);
            break;
        }

        //displaying the roll
        scanner.close();
    }
    static void printDie(int roll){
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;
        String dice2 = """
                    -------
                   | ●     |
                   |       |
                   |     ● |
                    -------
                   """;
        String dice3 = """
                    -------
                   | ●     |
                   |   ●   |
                   |     ● |
                    -------
                   """;
        String dice4 = """
                    -------
                   | ●   ● |
                   |       |
                   | ●   ● |
                    -------
                   """;
        String dice5 = """
                    -------
                   | ●   ● |
                   |   ●   |
                   | ●   ● |
                    -------
                   """;
        String dice6 = """
                    -------
                   | ●   ● |
                   | ●   ● |
                   | ●   ● |
                    -------
                   """;
        switch(roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("INVALID ROLL");
        }
    }
}
