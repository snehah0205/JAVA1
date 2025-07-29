package javaprgm;

public class Addlastdigit {

    // Method to add last digits of two numbers
    public static int addLastDigits(int input1, int input2) {
        // Take absolute value to ignore negative sign
        input1 = Math.abs(input1);
        input2 = Math.abs(input2);

        // Get last digits using % 10
        int lastDigit1 = input1 % 10;
        int lastDigit2 = input2 % 10;

        // Return the sum
        return lastDigit1 + lastDigit2;
    }

    public static void main(String[] args) {
        // Example test
        int result1 = addLastDigits(267, 154);
        System.out.println("Sum of last digits: " + result1); // Output: 11

        int result2 = addLastDigits(-267, -154);
        System.out.println("Sum of last digits: " + result2); // Output: 11
    }
}
