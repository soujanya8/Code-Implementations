import java.util.Scanner;

public class Basiccalc {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n<------ Basic Caluclator -------->\n");
        System.out.print("Enter a number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter a operator (+,-,*,/,^): ");
        char operator = scanner.next().charAt(0);
        scanner.nextLine();
        System.out.print("Enter a number: ");
        double num2 = scanner.nextDouble();
        boolean isValidOperation = true;

        double result =0;

        switch(operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if(num2 == 0){
                    System.out.println("Can't divide with zero\n\n");
                    isValidOperation = false;
                } else{
                    result = num1 / num2;
                }
                }
            case '^' -> result = Math.pow(num1 , num2);
            default -> System.out.println("Invalid Operator");

        }
        if(isValidOperation){
            System.out.printf("\n\n %.1f %c %.1f = %.1f\n\n",num1,operator,num2,result);
        }
        
    scanner.close();
    }
    
}
