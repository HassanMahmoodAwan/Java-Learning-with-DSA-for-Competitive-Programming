package Variables;

import java.util.*;

// Variables: For Storage. Every variable have memory block in Memory.

// DataTypes:
//      Permative  -> Build in: 
//          1- int (4), long (8), short, Byte (1)
//          2- char (2), float (4), double (8), boolean (1)
//      Non-Permative -> can customize its length or our own:
//          1- String, Array, Objects, etc

public class Main {
    public static void main(String[] args) {
        // Variables Started
        int a = 10;
        int b = 20;

        int sum = a + b;
        System.out.println(sum);

        // Input from User.
        Scanner sc = new Scanner(System.in); // Object of class Scanner.
        String name = sc.next(); // Only Read single word

        // Reading Multiple Words use : sc.nextLine();
        // Other : nextInt, nextFloat

        System.out.println(name);

        sc.close();
    }
}
