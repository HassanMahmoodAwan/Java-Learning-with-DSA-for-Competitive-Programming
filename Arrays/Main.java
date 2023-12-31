package Arrays;

// Arrays Size need to define First.

public class Main {
    public static void main(String[] args) {
        int Array[] = new int[3]; // Empty Array 0.
        int[] array = { 19, 20, 50 };

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        for (int j = 0; j < Array.length; j++) {
            System.out.println(Array[j]);
        }
    }
}
