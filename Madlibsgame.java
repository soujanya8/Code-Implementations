import java.util.Scanner;

public class Madlibsgame{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String noun1;
        int number;
        String noun2;
        String adjective1;
        String adjective2;
        String verb1;
        String noun3;
        System.out.print("Enter a Noun(person or animal): ");
        noun1 = scanner.nextLine();
        System.out.print("Enter a Number(hours): ");
        number = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter a Noun(person or animal): ");
        noun2 = scanner.nextLine();
        System.out.print("Enter an adjective(description): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter an adjective(description): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb(ing): ");
        verb1 = scanner.nextLine();
        System.out.print("Enter a Noun(person or animal): ");
        noun3 = scanner.nextLine();

        System.out.print("\n\n\<------Trip to Disney world------->\n");
        
        System.out.print("\n Last month, I went to Disney World with "+noun1+".");
        System.out.print("We traveled for "+number+"hours by "+noun2+ ".");
        System.out.print("Finally, we arrived and it was very "+adjective1+".");
        System.out.print("There were "+adjective2+" people "+verb1+" everywhere.");
        System.out.println("There were also people dressed up in "+noun3+" costumes.");
    }
}