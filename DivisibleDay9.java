import java.util.Scanner;

public class DivisibleDay9 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is divisible by 100
        if (number % 100 == 0) {
            System.out.println(number + " is divisible by 100.");
        } else {
            System.out.println(number + " is not divisible by 100.");
        }

        // Close the scanner
        scanner.close();
    }
}
