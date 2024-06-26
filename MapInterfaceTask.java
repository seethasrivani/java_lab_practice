package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapInterfaceTask {

	
		
		    public static void main(String[] args) {
		        // Create a Map to store cricketer names and their scores
		        Map<String, Integer> cricketerScores = new HashMap<>();

		        // Add some cricketer names and scores to the Map
		        cricketerScores.put("Sachin Tendulkar", 18426);
		        cricketerScores.put("Ricky Ponting", 13704);
		        cricketerScores.put("Virat Kohli", 12040);
		        cricketerScores.put("Jacques Kallis", 11579);
		        cricketerScores.put("Brian Lara", 10405);

		        // Print the initial Map
		        System.out.println("Initial Cricketer Scores: " + cricketerScores);

		        // Create a Scanner object for user input
		        Scanner scanner = new Scanner(System.in);

		        // Input the cricketer name to search for
		        System.out.println("Enter the cricketer name to search for:");
		        String cricketerName = scanner.nextLine();

		        // Search for the cricketer name and display the score
		        if (cricketerScores.containsKey(cricketerName)) {
		            int score = cricketerScores.get(cricketerName);
		            System.out.println(cricketerName + " has scored " + score + " runs.");
		        } else {
		            System.out.println(cricketerName + " is not found in the list.");
		        }

		        // Close the scanner
		        scanner.close();
		    }
		

	}

