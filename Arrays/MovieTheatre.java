/*Implement a Movie theater class that has methods to:
Method to display the seating chart. eg 0 represents an available seat, X represents a reserved seat
method to reserve a seat. If a seat is already reserved, tell use the seat is already taken.
Implement a main method to test your work.*/


package Arrays;

import java.util.Scanner;

public class MovieTheatre { //class
    private char[][] seats;

    public MovieTheatre(int rows, int cols) { //constructour
        seats = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                seats[i][j] = '0';
            }
        }
    }

    //method to display the seating chart
    public void displaySeatingChart() { 
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }

    //method to reserve a seat
    public void reserveSeat(int row, int col) {
        if (row < 0 || row >= seats.length || col < 0 || col >= seats[0].length) {
            System.out.println("Invalid seat selection.");
            return;
        }
        if (seats[row][col] == 'X') {
            System.out.println("Seat already taken.");
        } else {
            seats[row][col] = 'X'; // 'X' is for resrved seats
            System.out.println("Seat reserved successfully.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MovieTheatre theatre = new MovieTheatre(5, 5); //creating a 5x5 seating chart
        System.out.println("Initial seating chart:");
        theatre.displaySeatingChart();

        //test reservng seats includins a seat tha is already reserved
        System.out.println("Reserving seat at (2, 3):");
        theatre.reserveSeat(2, 3);
        theatre.displaySeatingChart();

        System.out.println("Trying to reserve seat at (2, 3) again:");
        theatre.reserveSeat(2, 3);
        theatre.displaySeatingChart();

        System.out.println("Reserving seat at (0, 0):");
        theatre.reserveSeat(0, 0);
        theatre.displaySeatingChart();


        //allow user to reserve seats
        while (true) {
            System.out.print("Enter row to reserve (-1 to quit): ");
            int row = scanner.nextInt();
            if (row == -1) break;

            System.out.print("Enter column to reserve (-1 to quit): ");
            int col = scanner.nextInt();
            if (col == -1) break;

            theatre.reserveSeat(row, col);
            theatre.displaySeatingChart();
        }

        scanner.close();
    }
}
