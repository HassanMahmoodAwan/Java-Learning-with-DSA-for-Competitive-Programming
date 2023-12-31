package Arrays;

import java.util.*;

public class Arrays_2d {
    public static void main(String[] args) {
        // Input 2d-Arrays:
        int rows;
        int cols;
        Scanner sc = new Scanner(System.in);
        rows = sc.nextInt();
        cols = sc.nextInt();

        int[][] Array_2d = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                Array_2d[i][j] = sc.nextInt();
            }
        }

        // Output 2d-Array
        System.out.println(Array_2d); // Give its Memory Location or garbage value.

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(Array_2d[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
