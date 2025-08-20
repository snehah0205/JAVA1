package Assignment;
import java.util.LinkedHashSet;
import java.util.Set;
public class RemoveDuplicateCharactersFromString {

	 public static String removeDuplicateChars(String input) {
	       
	        Set<Character> seen = new LinkedHashSet<>();
	        StringBuilder result = new StringBuilder();

	        for (char ch : input.toCharArray()) {
	            if (!seen.contains(ch)) {
	                seen.add(ch);
	                result.append(ch);
	            }
	        }

	        return result.toString();
	    }

	    public static void main(String[] args) {
	        String input = "programming";
	        String output = removeDuplicateChars(input);

	        System.out.println("Original String: " + input);
	        System.out.println("String without duplicates: " + output);
	    }
	}

