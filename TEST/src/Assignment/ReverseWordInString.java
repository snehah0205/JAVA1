package Assignment;

public class ReverseWordInString {
	
    public static String reverseEachWord(String input) {
		
		        String[] words = input.split(" ");
		        StringBuilder result = new StringBuilder();

		        for (String word : words) {
		          
		            StringBuilder reversedWord = new StringBuilder(word);
		            reversedWord.reverse();

		            result.append(reversedWord).append(" ");
		        }

		        return result.toString().trim();
		    }

		    public static void main(String[] args) {
		        String input = "Hello World from Java";
		        String output = reverseEachWord(input);
		        System.out.println("Original String: " + input);
		        System.out.println("Reversed Words:  " + output);
		    }
		}
