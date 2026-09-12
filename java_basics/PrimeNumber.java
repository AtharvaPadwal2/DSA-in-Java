import java.util.*;
public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number to check if prime: ");
        int num = sc.nextInt();

        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            // Time: O(sqrt(n)) | Space: O(1)
            for (int i = 2;  i <= num / i; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }

        sc.close();
    }
}

/*
 * Original approach:
 * Checks every number from 2 to num - 1.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * for (int i = 2; i < num; i++) {
 *     if (num % i == 0) {
 *         isPrime = false;
 *         break;
 *     }
 * }
 */