import java.util.*;
public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a integer");
        int number = sc.nextInt();
        long factorial = 1;
        if(number<0){
            System.out.println("Invalid input");
        
        }
        else{
        for( int i=1; i<=number;i++){
            factorial *= i;
           
        }
        System.out.println("The factorial of " + number + " is: " + factorial);

    }
        sc.close();
    }
}
