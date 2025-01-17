import java.util.*;
class FindSubstringOccurance{
    public static int CountSubstring(String s, String sub){
        //initializing count variable to 0
        int count =0;

        for (int i = 0; i <= s.length()-sub.length(); i++) {
            String hold= s.substring(i,i+sub.length());

            if(hold.equals(sub)){
                count++;

            }
        }


        return count;
    }

    public static void main(String args[]){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter string:");
        //String s= input.nextLine();
        String s = "kritika is a good person kritika is a girl";

        System.out.println("Enter substring:");
       // String sub= input.nextLine();
        String sub = " kritika";
        System.out.println("The occurance of "+sub+" is "+ CountSubstring(s,sub)+" times");


    }
}
