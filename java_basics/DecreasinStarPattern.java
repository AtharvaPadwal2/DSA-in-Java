import java.util.Scanner;
public class DecreasinStarPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        if(n<=0){
            System.out.println("Invalid Input");
        }
        else{
         for(int row=n;row>=1;row--){
            for(int column=1; column<=row;column++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
        sc.close();
    }
}
// Time Complexity: O(n²)
// Space Complexity: O(1)