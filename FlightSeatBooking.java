
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FlightSeatBooking {

    private static final int TOTAL_SEATS = 10;  // Total seats available on the flight
    private Set<Integer> bookedSeats = new HashSet<>();

    // Method to book a seat
    public boolean bookSeat(int seatNumber) {
        if (seatNumber < 1 || seatNumber > TOTAL_SEATS) {
            System.out.println("Invalid seat number. Please choose a seat between 1 and " + TOTAL_SEATS);
            return false;
        }

        // Check if the seat is already booked
        if (bookedSeats.contains(seatNumber)) {
            System.out.println("Seat " + seatNumber + " is already booked.");
            return false;
        }

        // Book the seat
        bookedSeats.add(seatNumber);
        System.out.println("Seat " + seatNumber + " successfully booked.");
        return true;
    }

    // Method to display available seats
    public void displayAvailableSeats() {
        System.out.println("Available seats:");
        for (int i = 1; i <= TOTAL_SEATS; i++) {
            if (!bookedSeats.contains(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        FlightSeatBooking flight = new FlightSeatBooking();
        Scanner scanner = new Scanner(System.in);
        int seatNumber;

        while (true) {
            System.out.println("\n1. Book a seat");
            System.out.println("2. Display available seats");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter seat number to book (1-" + TOTAL_SEATS + "): ");
                    seatNumber = scanner.nextInt();
                    flight.bookSeat(seatNumber);
                    break;
                case 2:
                    flight.displayAvailableSeats();
                    break;
                case 3:
                    System.out.println("Exiting the program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
