public class Discount
{
  public static void main(String [] args) 
  {

    int fees = 125000;
    int DiscountPercent =10;

    double variable = (double) fees * DiscountPercent/100 ;

    double Discountedfees = fees- variable;
    System.out.println(" The discount amount is INR " + variable + "  and final discounted fee is INR " + Discountedfees );




   }
}