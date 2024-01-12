import java.util.Scanner;

public class SumOfDigitsCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer (N): ");
        int N = scanner.nextInt();

        int sum = 0;

        while (N > 0) {
            sum += N % 10;
            N /= 10;
        }

        System.out.println("Sum of digits is: " + sum);

        scanner.close();
    }
}
