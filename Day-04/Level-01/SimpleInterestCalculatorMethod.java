import java.util.Scanner;

public class SimpleInterestCalculatorMethod {

    // Method to calculate Simple Interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

         // Input to take Principal
        System.out.print("Enter the Principal amount: ");
        double principal = scanner.nextDouble();

        // Input to take Rate
        System.out.print("Enter the Rate of Interest: ");
        double rate = scanner.nextDouble();

        // Input to take Time
        System.out.print("Enter the Time (in years): ");
        double time = scanner.nextDouble();

        // Calculate Simple Interest using principle ,rate and time.
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        // Output the result
        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f%% and Time %.2f years.%n",
                simpleInterest, principal, rate, time);
        
       
    }
}
