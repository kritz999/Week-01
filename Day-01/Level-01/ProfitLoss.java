public class ProfitLoss
{

  public static void main(String[]args)
  {
   
   int costPrice = 129;
   int sellingPrice = 191;

   int Profit = sellingPrice - costPrice;
   double Percentage = (double) Profit/ costPrice *100;
   
       System.out.println("The Cost Price is INR " + costPrice + " and selling Price is INR " + sellingPrice + "\nThe profit is INR " + Profit + " and the profit percentage is " +      Percentage + "%");

  }

 }


