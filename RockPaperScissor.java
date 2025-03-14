import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        // rock paper scissor game

        String[] rpsgame = { "rock", "paper", "scissors" };
        String choice;
        String aiGenerated;
        boolean wrongChoice = true;
        String response;
        do {
            System.out.print("Enter your choice (rock,paper,scissors): ");
            choice = scanner.nextLine().toLowerCase();
            while (wrongChoice) {
                if (!choice.equals("rock") &&
                    !choice.equals("paper") &&
                    !choice.equals("scissors")) {
                    System.out.println("INVALID CHOICE");
                    System.out.print("Enter your choice again (rock,paper,scissos): ");
                    choice = scanner.nextLine().toLowerCase();
                } else {
                    wrongChoice = false;
                }
            }

            aiGenerated = rpsgame[random.nextInt(3)];
            System.out.println("Computer choose: " + aiGenerated);
            if (choice.equals(aiGenerated)) {
                System.out.println("Its a tie :))");
            } else if ((choice.equals("rock") && aiGenerated.equals("scissors"))
                    || (choice.equals("paper") && aiGenerated.equals("rock"))
                    || (choice.equals("scissors") && aiGenerated.equals("paper"))) {
                System.out.println("*****************");
                System.out.println("Hurray!!! You Won");
                System.out.println("*****************");
            } else {
                System.out.println("************");
                System.out.println("Computer Won");
                System.out.println("************");
            }
            System.out.print("Do you want to play again(Y /N): ");
            response = scanner.nextLine().toUpperCase();
        } while(response.equals("Y")||response.equals("YES"));
        System.out.println("Thank you, Have a Nice Day");

        scanner.close();
    }

}
