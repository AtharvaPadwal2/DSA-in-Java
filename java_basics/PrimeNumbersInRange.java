import java.util.*;
public class PrimeNumbersInRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Range : ");
        int range = sc.nextInt();

       if (range <= 1) {
            System.out.println("Invalid Input");
        } else {
            for (int number = 2; number <= range; number++) {
                boolean isPrime = true;

                for (int i = 2; i <= number / i; i++) {
    if (number % i == 0) {
        isPrime = false;
        break;
    }

                }

                if (isPrime) {
                    System.out.println(number);
                }
              
            }
        }
        sc.close();
    }
}

// Time Complexity: O(n√n)
// Space Complexity: O(1)