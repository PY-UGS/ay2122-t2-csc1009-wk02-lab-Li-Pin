import java.util.Scanner;

public class Lab2_Qn1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //Compute area of circle
        System.out.println("---Compute area of circle---");

        final double pi = 3.14159;

        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        double area = radius * radius * pi;

        System.out.print("The area for the circle of radius " + radius + " is " + area);

        input.close();
    }
}

