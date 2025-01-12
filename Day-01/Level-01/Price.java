public class Price {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompting the user to enter the unit price of an item
        System.out.println("ENTER THE VALUE OF UNIT PRICE");
        double unitPrice = sc.nextDouble();

        // Prompting the user to enter the quantity
        System.out.println("ENTER THE VALUE OF QUANTITY");
        int quantity = sc.nextInt();

        // Calculating the total purchase price
        double totalPurchasePrice = unitPrice * quantity;

        // Displaying the total purchase price with user-provided inputs
        System.out.println("The total purchase price is INR " + totalPurchasePrice + 
                           " if the quantity " + quantity + " and unit price is INR " + unitPrice);
    }
}

