package logicbuilding;


public class Additionalusingstring {
    public String func(String input1, String input2) {
        int i = input1.length() - 1;
        int j = input2.length() - 1;
        StringBuilder result = new StringBuilder();
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? input1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? input2.charAt(j) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            result.append(sum % 10);
            carry = sum / 10;

            i--;
            j--;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        Additionalusingstring adder = new Additionalusingstring();
        String num1 = "98765";
        String num2 = "4321";
        System.out.println("Sum: " + adder.func(num1, num2)); // Output: 103086
    }
}