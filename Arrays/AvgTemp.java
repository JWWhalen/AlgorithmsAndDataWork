//Calculate the avarage temperature, and give how many days are above the average temperature

// 1. taka an input from the user (eg 8)
// 2. promt the user to enter all the 8 numbers
// 3. calculate the average temperature
// 4. Given the avarage tempeture, how many of the numbers in line 2 are above the average temperature

package Arrays;

import java.util.Scanner;

public class AvgTemp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // crates a scanner object

        // 1: as per the assignment, this taakes an input from the user for the number
        // of days
        System.out.print("Enter the number of days: ");
        int numDays = scanner.nextInt();

        // 2: aS per the assignment, this prompts the user to enter the temp
        double[] temperatures = new double[numDays];
        for (int i = 0; i < numDays; i++) {
            System.out.print("Enter the temperature for day " + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble();
        }

        // 3: as per the assignment thiscalculates the avg temp
        double sum = 0;
        for (double temp : temperatures) {
            sum += temp;
        }
        double averageTemperature = sum / numDays;

        // 4: as per the assignment this determines how many days are above the average
        // temperature
        int aboveAverageDays = 0;
        for (double temp : temperatures) {
            if (temp > averageTemperature) {
                aboveAverageDays++;
            }
        }

        // this prints the results
        System.out.printf("The average temperature is: %.2f\n", averageTemperature);
        System.out.println("Number of days above average temperature: " + aboveAverageDays);

        scanner.close();
    }
}
