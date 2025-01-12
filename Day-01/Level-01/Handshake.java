import java.util.*; // Import Scanner class for taking input

public class Handshake {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.println("Enter the number of students: ");
        int n = sc.nextInt(); // Read the input value for number of students

        // Calculate the maximum number of handshakes using the formula: (n * (n - 1)) / 2
        int maxNumHandshakes = (n * (n - 1)) / 2;

        // Display the result: maximum number of handshakes
        System.out.println("The number of possible handshakes is: " + maxNumHandshakes);
    }
}
