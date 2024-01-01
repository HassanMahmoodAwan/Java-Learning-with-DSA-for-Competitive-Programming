package Loops;

public class for_loop {
    public static void for_advance() {
        int[] array = { 10, 12, 13, 14 };
        // String str = "Hello";
        for (int arr : array) {
            System.out.print(arr + " ");
        }
        // for (char ch : str) {
        // System.out.print(str + " ");
        // }

    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        for_advance();
    }

}
