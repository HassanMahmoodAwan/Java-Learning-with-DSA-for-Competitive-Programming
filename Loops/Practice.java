package Loops;

import java.util.*;

// Sum of n Natural Numbers.
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        // Printing table of a Number.
        int No = sc.nextInt();

        for (int j = 0; j <= 10; j++) {
            System.out.println(No + " x " + j + " = " + No * j);
        }
        sc.close();
    }
}
