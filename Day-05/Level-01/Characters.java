
import java.util.Scanner;
import java.util.Arrays;
public class Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
            String s1 =sc.next();
            char[] userDefined = characterFromString(s1);
            char[] buildIn = s1.toCharArray(); //string converts to character array
            boolean result =Equals(userDefined,buildIn);

        System.out.println("User defined result of string to character array"+Arrays.toString(userDefined));
        System.out.println("Build in result of string to  character array"+Arrays.toString(buildIn));
        System.out.println("Are they equal?"+result);
    }

    public static char[] characterFromString(String s1){
            char[] character = new char[s1.length()];

            for(int i=0;i<s1.length();i++){
                character[i]= s1.charAt(i);

            }

        return character;
    }
    public static boolean Equals(char[]arr1,char[]arr2){
            if(arr1.length!=arr2.length){
                return false;
            }
            for(int i=0;i<arr1.length;i++){
                if(arr1[i]!=arr2[i]){
                return false;}
            }
            return true;
    }


}
