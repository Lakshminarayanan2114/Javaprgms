import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int N = sc.nextInt();
        sc.close();

        // Upper pyramid
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
            System.out.println();
        }

        // Inverted pyramid
        for (int i = N - 1; i >= 1; i--) {
            for (int j = 1; j <= N - i; j++) System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
            System.out.println();
        }
    }
}
