import java.util.Scanner;

public class Weightconverter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //need to Improve more with the functionality

        System.out.print("Convert from kg or lb to lb or kg:");
        String strCon = scanner.nextLine().toLowerCase();
        System.out.print("Enter the weight:");
        double weightToBeConverted = scanner.nextDouble();
        double weight;

        if(strCon.contains("kg") || strCon.contains("kilogram")){
            weight = weightToBeConverted*0.453592 ;
            System.out.printf("\n\n%.2f lb is equal to %.2f kg\n\n",weightToBeConverted, weight);
            
        }else if(strCon.contains("lb") || strCon.contains("pound")){
            weight = weightToBeConverted*2.0462 ;
            System.out.printf("\n\n%.2f Kg is equal to %.2f lb\n\n",weightToBeConverted, weight);
        }
        else{
            System.out.println("We only Convert Kg to lb viceversa here :( ");
        }

        scanner.close();

    }
}
 