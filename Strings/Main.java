package Strings;

// Strings are Immutable.

public class Main {
    public static void main(String[] args) {
        String sentence = "Hello" + " " + "Hassan to Competitive Programming";

        // CharAt
        for (int i = 0; i < sentence.length(); i++) {
            System.out.println(sentence.charAt(i));
        }

        // compareTo
        String name1 = "Hassan";
        String name2 = "Hassan";

        if (name1.compareTo(name2) == 0) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        if (name1 == name2) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        if (new String("Ali") == new String("Ali")) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        // Subtring
        System.out.println(sentence.substring(0, 5));
        System.out.println(sentence.substring(4));
        System.out.println(sentence.substring(5, sentence.length()));
    }
}
