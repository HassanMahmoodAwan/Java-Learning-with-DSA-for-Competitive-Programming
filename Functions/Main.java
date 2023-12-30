package Functions;

// In Memory, Functions are saved in Stack form.
// When function call, it created in Memory and when it returns then finishes in memory.

public class Main {
    // User define Function
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // Function for Fictorial
    public static long fictorialNo(int number) {
        if (number < 0) {
            System.out.println("Invalid Input");
            return 0;
        }

        int fictorial = 1;
        for (int i = number; i > 0; i--) {
            fictorial = fictorial * i;
        }
        return fictorial;
    }

    // Main Function
    public static void main(String[] args) {
        int result = calculateSum(10, 20);
        System.out.println(result);

        long fictorial = fictorialNo(5);
        System.out.println(fictorial);
    }
}
