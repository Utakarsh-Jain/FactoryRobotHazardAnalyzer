/*

Goal
Accept inputs required for hazard analysis from the user.
Actor
User
Flow
1. User enters arm precision
2. User enters worker density
3. User enters machinery state
4. Program echoes the inputs

Name: Utakarsh Jain
Date: 11/11/2026
 */

package org.example;
import java.util.Scanner;
public class FactoryRobotHazardAnalyzer {

    public static void main(String[] args) {

        // Create Scanner object to accept user input
        Scanner scanner = new Scanner(System.in);
        // Display the name of the application
        System.out.println("Factory Robot Hazard Analyzer");
        // Accept arm precision as a decimal value
        System.out.println("Enter Arm Precision (0.0 - 1.0):");
        double armPrecision = scanner.nextDouble();
        // Accept worker density as an integer value
        System.out.println("Enter Worker Density (1 - 20):");
        int workerDensity = scanner.nextInt();
        // Consume the leftover newline character
        scanner.nextLine();
        // Accept machinery state as a String
        System.out.println("Enter Machinery State (Worn/Faulty/Critical):");
        String machineryState = scanner.nextLine();

        // Display all the inputs entered by the user
        System.out.println("\nRobot Hazard Inputs:");

        System.out.println("Arm Precision: " + armPrecision);
        System.out.println("Worker Density: " + workerDensity);
        System.out.println("Machinery State: " + machineryState);
        // Close Scanner after completing input operations
        scanner.close();
    }
}

