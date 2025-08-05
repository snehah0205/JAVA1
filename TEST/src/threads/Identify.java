package threads;

public class Identify {

    public static void main(String[] args) {
        String input1 = "Fi_er";
        String input2 = "Fever:filer:Filter:Fixer:fiber:fibre:tailor:offer";

        String result = identifyPossibleWords(input1, input2);
        System.out.println(result);
    }

    public static String identifyPossibleWords(String input1, String input2) {
        input1 = input1.toLowerCase();
        String[] words = input2.toLowerCase().split(":");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            word = word.trim();
            if (word.length() != input1.length()) continue;

            boolean isMatch = true;
            for (int i = 0; i < input1.length(); i++) {
                char ch1 = input1.charAt(i);
                char ch2 = word.charAt(i);

                if (ch1 != '_' && ch1 != ch2) {
                    isMatch = false;
                    break;
                }
            }

            if (isMatch) {
                result.append(word.toUpperCase()).append(" ");
            }
        }

        if (result.length() == 0) {
            return "ERROR-009";
        }

        return result.toString().trim();
    }
}