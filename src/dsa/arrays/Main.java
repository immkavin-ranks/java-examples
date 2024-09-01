package dsa.arrays;

// Find days above average temperature

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many day's temperature? ");
        int numberOfDays = scanner.nextInt();

        double [] temperatures = new double[numberOfDays];

        double sumOfTemperatures = 0;
        for (int i = 0; i < temperatures.length; i++) {
            System.out.print("Day " + (i+1) + "'s temperature: ");
            temperatures[i] = scanner.nextInt();
            sumOfTemperatures += temperatures[i];
        }

        double averageTemperature = sumOfTemperatures / numberOfDays;
        System.out.println("Average temperature is " + String.format("%.2f", averageTemperature));
        int daysAboveAverageTemperature = 0;
        for ( double temperature : temperatures) {
            if (temperature > averageTemperature) daysAboveAverageTemperature++;
        }
        System.out.println(daysAboveAverageTemperature + " day(s) above average temperature.");
    }
}
