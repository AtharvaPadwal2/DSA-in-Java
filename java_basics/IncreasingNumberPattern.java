import java.util.Scanner;
public class IncreasingNumberPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows");
        int n = sc.nextInt();

        if(n<=0){
            System.out.println("Invalid Input");
        }

        for(int row=1;row<=n;row++){
            for(int column=1; column<=row;column++){
                System.out.print(column);
            }
            System.out.println();
        }
        sc.close();
    }
}
// Time Complexity: O(n²)
// Space Complexity: O(1)