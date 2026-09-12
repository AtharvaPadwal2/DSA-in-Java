import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

       int count = 0;
int temp = num;

if (temp == 0) {
    count = 1;
} else {
    while (temp != 0) {
        temp = temp / 10;
        count++;
    }
}

        System.out.println("The length of the entered number is: " + count);
        sc.close();
    }
}
