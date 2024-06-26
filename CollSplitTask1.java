package collections;

import java.util.Scanner;

public class CollSplitTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);
		        
		        // Input the text
		        System.out.println("Enter the text:");
		        String text = scanner.nextLine();
		        
		        // Input the word to count
		        System.out.println("Enter the word to count:");
		        String word = scanner.nextLine();
		        
		        // Split the text into words
		        String[] words = text.split("\\s+");
		        
		        // Count the occurrences of the word
		        int count = 0;
		        for (String w : words) {
		            if (w.equals(word)) {
		                count++;
		            }
		        }
		        
		        // Output the result
		        System.out.println("The word '" + word + "' occurs " + count + " times in the text.");
		        
		        scanner.close();
		    }
		

	
}
