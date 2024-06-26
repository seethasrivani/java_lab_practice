package collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class TreeMapTask {

	public static void main(String[] args) {
		
		

		
		        // Create a TreeMap to store word-definition pairs
		        TreeMap<String, String> dictionary = new TreeMap<>();

		        // Create a Scanner object for user input
		        Scanner scanner = new Scanner(System.in);
		        
		        // Option to continue adding words
		        boolean continueAdding = true;

		        while (continueAdding) {
		            // Input word and definition to add to the dictionary
		            System.out.println("Enter a word:");
		            String word = scanner.nextLine();
		            System.out.println("Enter the definition:");
		            String definition = scanner.nextLine();
		            
		            // Add the word-definition pair to the dictionary
		            dictionary.put(word, definition);
		            
		            // Check if the user wants to add another word
		            System.out.println("Do you want to add another word? (yes/no):");
		            String response = scanner.nextLine();
		            if (!response.equalsIgnoreCase("yes")) {
		                continueAdding = false;
		            }
		        }

		        // Input the word to retrieve its definition
		        System.out.println("Enter a word to retrieve its definition:");
		        String searchWord = scanner.nextLine();

		        // Retrieve and display the definition of the specific word
		        if (dictionary.containsKey(searchWord)) {
		            System.out.println("Definition of " + searchWord + ": " + dictionary.get(searchWord));
		        } else {
		            System.out.println("The word '" + searchWord + "' is not in the dictionary.");
		        }

		        // Iterate through the dictionary to display all word-definition pairs
		        System.out.println("\nAll word-definition pairs in the dictionary (in alphabetical order):");
		        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
		            System.out.println(entry.getKey() + ": " + entry.getValue());
		        }

		        // Close the scanner
		        scanner.close();
		    }
		

	}


