import java.util.Scanner;

public class MethodPractice {

   
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = sc.nextInt();

        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        int result = add(a, b);
        System.out.println("Sum: " + result);

        sc.close();
    }
}

// Time Complexity: O(1)
// Space Complexity: O(1)
