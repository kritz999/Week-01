
class MaxFactorArray{
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);

        // Take input for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number <= 0) {
          System.out.println("Error: Please enter a positive number.");
            return;
        }

        // Initialize variables
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Find factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maxFactor) {
                    // Double the size of the factors array without using arraycopy
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp;
                }
                factors[index] = i;
                index++;
            }
        }

        // Display the factors
        System.out.print("Factors of " + number + ": ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}

