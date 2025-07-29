package javaprgm;

public class calculator {

    // Method to calculate power for integers
    public static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    // Method to calculate power for double base
    public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }

    public static void main(String[] args) {
        // Test powerInt method
        int intResult = powerInt(2, 3); // 2^3 = 8
        System.out.println("powerInt(2, 3) = " + intResult);

        // Test powerDouble method
        double doubleResult = powerDouble(2.5, 3); // 2.5^3 = 15.625
        System.out.println("powerDouble(2.5, 3) = " + doubleResult);
    }
}
