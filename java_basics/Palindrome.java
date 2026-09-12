import java.util.Scanner;
public class Palindrome {

    public static void main(String[] args) {
        int reverse =0;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number to check if palindrome :");
        int num = sc.nextInt();

        int original = num;
        while (num !=0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num /10;
        }
        if(original==reverse){
        System.out.println("The entered number is a palindrome");
        }
        else{
            System.out.println("The entered number is not a plaindrome");
        }
        sc.close();
    }
}
