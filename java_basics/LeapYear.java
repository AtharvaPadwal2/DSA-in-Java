import java.util.Scanner;
public class LeapYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Year :");
        int year = sc.nextInt();

        if(year%400==0){
            System.out.println("The Given Year is a Leap Year: "+ year);
        }
        else if(year%4==0 && year%100 != 0){
            System.out.println("The Given Year is a Leap Year: "+ year);
        }
        else{
            System.out.println("The Given Year is not a Leap Year: "+ year);
        }

        sc.close();

    }
    
}
