import java.util.*;
public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of term for fibonacci series :");
        int terms = sc.nextInt();
        if(terms<=0){
            System.out.println("invalid input given");
        }
        else{

            int first = 0;
            int second = 1;
          System.out.print("Fibonacci Series: " );
            
             for (int i = 1; i <= terms; i++) { 
                 System.out.print(first + " ");
            int next = first + second;
            
            first=second;
            second=next;
             }
        }
        sc.close();
    }
}
