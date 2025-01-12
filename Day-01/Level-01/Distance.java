import java.util.*; // Importing the Scanner class for user input

public class Distance {

    public static void main(String[] args) {

        // Creating a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Declaring variables to store distance in feet, yards, and miles
        double feet, yard, miles;

        // Prompting the user to enter the distance in feet
        System.out.println("ENTER THE VALUE OF DISTANCE IN FEET");

        // Reading the user input for distance in feet
        feet = sc.nextDouble();

        // Calculating the distance in yards (1 yard = 3 feet)
        yard = feet / 3;

        // Calculating the distance in miles (1 mile = 1760 yards)
        miles = yard / 1760

}
}