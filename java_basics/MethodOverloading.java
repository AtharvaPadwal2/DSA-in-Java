public class MethodOverloading {
    
    public static int add(int a, int b) {
        return a + b;
    }
    public static int add (int a , int b , int c){
        return a + b + c;
    }
    public static double add(double a , double b){
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(10, 20));
        System.out.println(add(10, 20, 30));
        System.out.println(add(5.5, 2.5));
    }
}

// Each method performs constant-time arithmetic.
// Time Complexity: O(1)
// Space Complexity: O(1)