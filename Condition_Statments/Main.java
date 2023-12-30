package Condition_Statments;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        if (a < b) {
            System.out.println(a + " Less then " + b);
        } else if (a > b) {
            System.out.println(a + " Greater then " + b);
        } else {
            System.out.println("Both are equal");
        }

        input.close();
    }
}
