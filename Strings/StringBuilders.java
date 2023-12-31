package Strings;

// import java.util.*;

// StringBuilder is Mutable.

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hasan");

        // charAt
        System.out.println(sb.charAt(2));

        // setCharAt
        sb.setCharAt(0, 'h');
        System.out.println(sb);

        // Insert, Apend and delete
        sb.insert(2, 's');
        System.out.println(sb);
        sb.append("Hello");
        System.out.println(sb);
        sb.delete(6, sb.length());

        System.out.println(sb);
    }
}
