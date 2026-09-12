import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        int reverse = 0 ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number to be reversed");
        int number = sc.nextInt();

       
        while(number != 0){
            int digit = number%10;
            reverse = reverse*10 + digit;
            number=number/10;

        }
         System.out.println("Reversed Number: " + reverse);

        sc.close();
    }
}