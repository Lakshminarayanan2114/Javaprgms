import java.util.Scanner;

public class calcDay11 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input two numbers and an operator
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Enter operator (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);

        // Initialize the result variable
        double result = 0;

        // Perform the operation using switch without break statements
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // Check for division by zero
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    scanner.close();
                    return; // Exit the program early in case of error
                }
                break;
            case '%':
                // Check for modulus by zero
                if (num2 != 0) {
                    result = num1 % num2;
                } else {
                    System.out.println("Error: Modulus by zero is not allowed.");
                    scanner.close();
                    return; // Exit the program early in case of error
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                scanner.close();
                return; // Exit the program early in case of invalid operator
        }

        // Output the result
        System.out.println("Result: " + result);
        
        // Close the scanner
        scanner.close();
    }
}
