package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CollTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Create a queue to represent the circle of players
		        Queue<String> players = new LinkedList<>();

		        // Enqueue player names
		        players.add("Alice");
		        players.add("Bob");
		        players.add("Charlie");
		        players.add("Diana");
		        players.add("Eve");

		        Scanner scanner = new Scanner(System.in);

		        while (players.size() > 1) {
		            System.out.println("Press Enter to simulate passing the potato...");
		            scanner.nextLine();

		            // Simulate passing the potato by dequeueing and enqueueing players
		            String player = players.poll();
		            players.add(player);

		            // Simulate the music stopping and a player being eliminated
		            System.out.println(player + " is eliminated.");
		            players.poll(); // The player holding the potato is out
		        }

		        // The last remaining player is the winner
		        System.out.println("The winner is: " + players.peek());
		        scanner.close();
		    }
		

	}


