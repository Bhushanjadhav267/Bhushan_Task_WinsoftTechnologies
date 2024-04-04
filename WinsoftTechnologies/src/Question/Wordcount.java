package Question;
import java.util.HashMap;
public class Wordcount {

	public static void main(String[] args) {
		 String str = "This is a sample string with some words. Sample string is used for demonstration.";
	        
	        HashMap<String, Integer> wordCountMap = new HashMap<>();

	       
	        String[] words = str.split("\\s+");

	        
	        for (String word : words) {
	            word = word.toLowerCase(); 
	            if (!wordCountMap.containsKey(word)) {
	                wordCountMap.put(word, 1);
	            } else {
	                wordCountMap.put(word, wordCountMap.get(word) + 1);
	            }
	        }

	        // Print the word count
	        System.out.println("Word Count:");
	        for (String word : wordCountMap.keySet()) {
	            System.out.println(word + ": " + wordCountMap.get(word));
	        }

	}

}
