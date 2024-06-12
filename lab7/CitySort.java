package lab7;

import java.util.Scanner;

public class CitySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cities = new String[5];

        // Input the names of 5 cities
        System.out.println("Enter the names of 5 cities:");
        for (int i = 0; i < cities.length; i++) {
            System.out.print("City " + (i + 1) + ": ");
            cities[i] = sc.nextLine();
        }

        // Sort the cities in alphabetical order using string handling
        for (int i = 0; i < cities.length - 1; i++) {
            for (int j = i + 1; j < cities.length; j++) {
                if (cities[i].compareTo(cities[j]) > 0) {
                    // Swap cities[i] and cities[j]
                    String temp = cities[i];
                    cities[i] = cities[j];
                    cities[j] = temp;
                }
            }
        }

        // Display the sorted city names
        System.out.println("\nCities in alphabetical order:");
        for (String city : cities) {
            System.out.println(city);
        }

        sc.close();
    }
}
