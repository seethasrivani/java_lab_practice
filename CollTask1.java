package collections;

import java.util.HashSet;

public class CollTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        HashSet<Integer> set = new HashSet<>();

		        // Add the numbers 5, 10, 15, 20, and 25 to the set
		        set.add(5);
		        set.add(10);
		        set.add(15);
		        set.add(20);
		        set.add(25);

		        // Display the elements of the set
		        System.out.println("Elements in the set: " + set);

		        // Check if the set contains the number 10
		        if (set.contains(10)) {
		            System.out.println("The set contains the number 10.");
		        } else {
		            System.out.println("The set does not contain the number 10.");
		        }

		        // Remove the number 15 from the set
		        set.remove(15);

		        // Display the size of the set
		        System.out.println("Size of the set after removal: " + set.size());
		    }
		

	}


