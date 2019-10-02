import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);



        // User enter weight in KG.
        System.out.println("Enter weight in Kilograms: ");
        double weightInKilograms = input.nextDouble();

        // User enter height in cm;
        System.out.println("Enter height in Meters");
        double heightInMeters = input.nextDouble();
        // Compute BMI
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        // Display the result
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal weight");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");


}
}
