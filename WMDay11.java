import java.util.Scanner;

public class WMDay11 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask for the weight of the clothes
        System.out.print("Enter the weight of clothes in grams (0 to 7000 grams): ");
        int weight = scanner.nextInt();

        // Ask for the water level choice
        System.out.print("Enter the water level (1 for low, 2 for medium, 3 for high): ");
        int waterLevel = scanner.nextInt();

        // Variable to store time needed
        int time = 0;

        // Logic based on water level and weight
        if (weight == 0) {
            time = 0;  // No weight means no washing time
        } else {
            switch (waterLevel) {
                case 1:  // Low level water
                    if (weight > 0 && weight <= 2000) {
                        time = 25;
                    } else {
                        System.out.println("Error: Weight for low water level should be between 1 and 2000 grams.");
                        return;
                    }
                    break;
                case 2:  // Medium level water
                    if (weight >= 2001 && weight <= 4000) {
                        time = 35;
                    } else {
                        System.out.println("Error: Weight for medium water level should be between 2001 and 4000 grams.");
                        return;
                    }
                    break;
                case 3:  // High level water
                    if (weight > 4000 && weight <= 7000) {
                        time = 45;
                    } else {
                        System.out.println("Error: Weight for high water level should be between 4001 and 7000 grams.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Error: Invalid water level choice.");
                    return;
            }
        }

        // Output the result
        System.out.println("Time needed for washing: " + time + " minutes.");

        // Close the scanner
        scanner.close();
    }
}
