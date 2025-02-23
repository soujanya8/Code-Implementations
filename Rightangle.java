import java.util.Scanner;

public class Rightangle {
    public static void main(String[] args){
        //excercise to find hypotenuse of right angle triangle
        // c = sqrt of (a^2 + b^2)
        //and Area of triangle 1/2*base*height
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base length of Right angle triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter height length of Right angle triangle: ");
        double height = scanner.nextDouble();
        double hypotenuse;
        double area;
        hypotenuse = Math.sqrt(Math.pow(base , 2)+ Math.pow(height , 2));
        area = (base*height)/2;

        System.out.println("Hypotenuse of right angle triangle is: "+hypotenuse);
        System.out.println("Area of right angle triangle is: "+area);

        scanner.close();
    }
    
}
