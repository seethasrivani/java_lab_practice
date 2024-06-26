package collections;

import java.util.HashMap;
import java.util.Scanner;

public class CollHashMapTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Create a HashMap
		        HashMap<String, Integer> hashMap = new HashMap<>();

		        // Store some elements in the HashMap
		        hashMap.put("Apple", 10);
		        hashMap.put("Banana", 20);
		        hashMap.put("Cherry", 30);
		        hashMap.put("Date", 40);

		        // Print the initial HashMap
		        System.out.println("Initial HashMap: " + hashMap);

		        // Create a Scanner object for user input
		        Scanner scanner = new Scanner(System.in);

		        // Input key and value to be added to the HashMap
		        System.out.println("Enter the key to be added/updated:");
		        String key = scanner.nextLine();
		        System.out.println("Enter the value to be associated with the key:");
		        int value = scanner.nextInt();

		        // Associate the specified value with the specified key
		        hashMap.put(key, value);

		        // Print the updated HashMap
		        System.out.println("Updated HashMap: " + hashMap);

		        // Close the scanner
		        scanner.close();
		    }
		

	}


