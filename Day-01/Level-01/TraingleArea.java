public class TraingleArea
{
	public static void main(String[] args)
	{
		//Initializing  variables
		int base, height;
		double area;

		//Creating our scanner object
		Scanner input = new Scanner(System.in);

		///Taking base and height as inputs
		System.out.print("Enter base of triangle: ");
		base = input.nextInt();
		System.out.print("Enter height of triangle: ");
		height = input.nextInt();
	
		//Calculating area using the formula
		area = (double) 1/2 * base * height;

		System.out.print("The triangle base is " + base + " and height is " + height + " and area is " + area);
		input.close();
	}
}

