import java.util.Scanner;

public class PrimeUsingMethod {
    
    public static boolean isPrime(int number) {
        if (number <= 1) {
    return false;
}
        // Time Complexity: O(√n)
// Space Complexity: O(1)
        for (int i = 2; i <= number / i; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }

        sc.close();
    }
}
