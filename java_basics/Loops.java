import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        int sum = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Positive Number :");
        int Number = sc.nextInt();

        for(int i=0;i<=Number;i++){
            System.out.println(i);
        }

         for(int i=Number;i>=0;i--){
            System.out.println(i);
        }
for(int i=0;i<=Number;i++){
        sum += i ;
        
        }
        System.out.println(sum);    

        for(int i=1;i<=10;i++){
       System.out.println(Number + " x " + i + " = " + (Number * i));
        
        }
        
        
        
        sc.close();
    }
}