/**
 * A Java program to check if a number is an Armstrong number without using Math.pow().
 * An Armstrong number is a number that is equal to the sum of its own digits, each raised to the power of the number of digits.
 * For example, 153 is an Armstrong number because $1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153$.
 */
public class ArmstrongCheckerNoPow {

    /**
     * Calculates the power of a base raised to an exponent without using Math.pow().
     * This method is used to mimic the `r**b` operation from the Python code.
     * @param base The base number.
     * @param exp The exponent.
     * @return The result of base^exp.
     */
    public static long power(int base, int exp) {
        long result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        // The number to check
        int n = 153;
        
        // Storing the original number in a separate variable for comparison later
        int originalNumber = n;
        
        // Getting the number of digits by converting the number to a string
        int numDigits = String.valueOf(n).length();
        
        long sum = 0;
        
        // Loop to extract each digit and calculate the sum of its powers
        while (n != 0) {
            int remainder = n % 10;
            sum = sum + power(remainder, numDigits);
            n = n / 10;
        }
        
        // Check if the sum equals the original number and print the result
        if (originalNumber == sum) {
            System.out.println("The given number " + originalNumber + " is an armstrong number.");
        } else {
            System.out.println("The given number " + originalNumber + " is not an armstrong number.");
        }
    }
}
