package Arrays;

// Arrays Size need to define First.

public class Main {

    // Take Array as Input and find the Index of element given.
    public static int finding_index(int[] array, int element) {
        int counter = 0;
        int result = 0;

        while (counter < array.length) {
            if (array[counter] == element) {
                result = counter;
                break;
            }
            counter += 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int Array[] = new int[3]; // Empty Array 0.
        int[] array = { 19, 20, 50 };

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        for (int j = 0; j < Array.length; j++) {
            System.out.println(Array[j]);
        }

        // Function Calling
        System.out.println(finding_index(array, 20));
    }
}
