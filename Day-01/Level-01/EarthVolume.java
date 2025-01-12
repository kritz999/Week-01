public class EarthVolume
{
	public static void main(String[] args)
	{
		//First we take the radius in kms
		int radiusInKms = 6378;
		//Then we will convert kms to miles
		double radiusInMiles = radiusInKms / 1.6;
		//Then we find volume in both cubic kms and cubic miles
		double volumeInKms = 4/3 * Math.PI * Math.pow(radiusInKms, 3);
		double volumeInMiles = 4/3 * Math.PI * Math.pow(radiusInMiles, 3);
		
		System.out.print("The volume of earth in cubic kilometers is " + volumeInKms + " and cubic miles is " + volumeInMiles);
	}
}

