import java.util.Scanner;

public class Circle {
    public static void main(String []args){
        // Lets find out Circumference,Area and volume of circle
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of circle: ");
        double r = scanner.nextDouble();
        double circumference = 2*Math.PI*r;
        double area = Math.PI*Math.pow(r,2);
        double volume = 4*Math.PI*Math.pow(r,3)/3;

        
        System.out.println("\nThe circumference of circle with "+r+" as radius is: "+circumference+"cm");
        System.out.println("The area of circle with "+r+" as radius is: "+area+"cm²");
        System.out.println("The volume of sphere with "+r+" as radius is: "+volume+"cm³\n");


        scanner.close();

    }
    
}
