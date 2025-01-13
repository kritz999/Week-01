import java.util.HashSet;

public class OTPGeneratorMethod {

    // Method to generate a 6-digit OTP number
    public static int generateOTP() {
        // Generate a random number between 100000 and 999999 (inclusive)
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method to check if the OTP numbers are unique
    public static boolean areUniqueOTPs(int[] otps) {
        HashSet<Integer> otpSet = new HashSet<>();
        // Add OTPs to a HashSet, which automatically ensures uniqueness
        for (int otp : otps) {
            otpSet.add(otp);
        }
        // If the size of the HashSet is the same as the array length, all OTPs are unique
        return otpSet.size() == otps.length;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }

        // Print the generated OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        // Check if all OTPs are unique
        if (areUniqueOTPs(otps)) {
            System.out.println("\nAll OTPs are unique.");
        } else {
            System.out.println("\nSome OTPs are not unique.");
        }
    }
}
