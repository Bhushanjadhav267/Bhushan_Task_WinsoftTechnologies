package Question;
import java.util.HashMap;
public class Duplicatechar {

	public static void main(String[] args) {
		 String str = "programming";

	        // Create a HashMap to store character frequencies
	        HashMap<Character, Integer> charCountMap = new HashMap<>();

	        // Iterate over each character of the string
	        for (char ch : str.toCharArray()) {
	            // If the character is already in the HashMap, increment its count
	            if (charCountMap.containsKey(ch)) {
	                charCountMap.put(ch, charCountMap.get(ch) + 1);
	            } else {
	                // If the character is not in the HashMap, add it with a count of 1
	                charCountMap.put(ch, 1);
	            }
	        }

	        // Print duplicate characters
	        System.out.println("Duplicate characters in the string:");
	        for (char ch : charCountMap.keySet()) {
	            if (charCountMap.get(ch) > 1) {
	                System.out.println(ch);
	            }
	        }

	}

}
