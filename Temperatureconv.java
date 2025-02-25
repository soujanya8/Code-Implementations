import java.util.Scanner;

public class Temperatureconv {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double temp;
        double newTemp;
        String unit;
        System.out.println("<<<-------Temperature Conversion ------->>>");
        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Is conversion is from Celsius or Fahrenheit (C or F): ");
        unit = scanner.nextLine().toUpperCase();

        newTemp = (unit.contains("C")) ? 5*(temp-32)/9 : (temp*9/5)+32;
        
        System.out.printf("\n\n          Converted temperature: %.2f °%s\n\n",newTemp,unit);
        scanner.close();

    }
}
