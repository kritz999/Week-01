public class Discount
{
	public static void main(String[] args)
	{
		//initialize the fee amount and discount percent variables
		int fee, discountPercent;
		
		//create scanner object to take input
		Scanner input = new Scanner(System.in);
		
		// take input for fee and DiscountPercent
		System.out.print("Enter fee amount: ");
		fee = input.nextInt();
		System.out.print("Enter discount percent: ");
		discountPercent = input.nextInt();
		
		//Calculating the discount amount
		double discount = (double) (fee * discountPercent) / 100;
		//calculate the amount after applying the discount on the fee
		double finalFee = fee - discount;
		
   System.out.print("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);

		input.close();
	}
}

