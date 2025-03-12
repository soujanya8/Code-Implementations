import java.util.Scanner;
public class Quizz {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        String[] questions = {"What is the tallest waterfall in the world?",
                               "What is the capital city of Canada?",
                               "Which element is known as the building block of life?"};
        String[][] options = {{"1. Angel Falls ","2. Niagara Falls","3. Sutherland Falls"},
                              {"1. Montreal","2. Toronto","3. Ottawa"},
                              {"1. Oxygen","2. Carbon","3. Hydrogen"}};
        //To access each Row in an 2Darray
        for(int i=0; i<3;i++){
            for(String op : options[i]){
                System.out.println(op);
            }
        }

        int[] key = {1, 3, 2};
        int guess;
        int score = 0;
        System.out.println("----------");
        System.out.println("Quizz Game");
        System.out.println("----------");

        for(int i=0;i < questions.length;i++){
            System.out.println(questions[i]);
            for(String option : options[i]){ 
                //options[i] is takes each row as an array and displays everything in row1
                System.out.println(option);
            }
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if(guess == key[i]){
                score++;
            }
        }
        System.out.println("-----------------");
        System.out.printf("Your score is: %d\n",score);
        System.out.println("-----------------");

        //quizz and score
        //result
        scanner.close();
    }
}
