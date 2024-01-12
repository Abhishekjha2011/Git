import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        // Read the integer N from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer (N): ");
        int N = scanner.nextInt();


        if (N < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {

            long result = 1;


            for (int i = 1; i <= N; i++) {

                result *= i;
            }


            System.out.println("Factorial of " + N + " is: " + result);
        }


        scanner.close();
    }
}