import java.util.Scanner;

public class Divisible27Day9 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is divisible by 100
        if (number % 27 == 0) {
            System.out.println(number + " is divisible by 27.");
        } else {
            System.out.println(number + " is not divisible by 27.");
        }

        // Close the scanner
        scanner.close();
    }
}
