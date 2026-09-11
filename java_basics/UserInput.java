import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter You Name");
        String Name = sc.nextLine();
        
        System.out.print("Enter Your age");
int age = sc.nextInt();

 System.out.print("Enter Your CGPA");
        double CGPA = sc.nextDouble();

        

         System.out.println("\nYour Details:");
        System.out.println("Name: " + Name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + CGPA);

        sc.close();


        

    }
}