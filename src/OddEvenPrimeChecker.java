import java.util.Scanner;

public class OddEvenPrimeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the integer Number: ");
        int num = scanner.nextInt();

        if (num < 2 || num > 1000) {
            System.out.println("Invalid input");
        } else {
            boolean isPrime = checkPrime(num);

            if (isPrime) {
                if (num % 2 == 0) {
                    System.out.println("Even Not Prime");
                } else {
                    System.out.println("Odd Prime");
                }
            } else {
                System.out.println("Odd Not Prime");
            }
        }
    }

    private static boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
