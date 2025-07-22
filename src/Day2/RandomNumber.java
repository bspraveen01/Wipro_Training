package Day2;

import java.util.Random;

public class RandomNumber {

    // Method to generate a 10-digit random number
    public static long generateTenDigitNumber() {
        Random rand = new Random();

        // Range: 1000000000 to 9999999999 (inclusive)
        long number = 1_000_000_000L + (long)(rand.nextDouble() * 9_000_000_000L);
        return number;
    }

    public static void main(String[] args) {
        long randomNumber = generateTenDigitNumber();
        System.out.println("Random 10-digit number: " + randomNumber);
    }
}
