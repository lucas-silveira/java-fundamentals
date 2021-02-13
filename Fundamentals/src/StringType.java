import java.util.Locale;

public class StringType {
    public static void main(String[] args) {
        // String type
        String s = "Hello world";
        System.out.println(s); // Hello world

        // String type is a immutable object
        s = s.toUpperCase();
        System.out.println(s); // HELLO WORLD

        s = s.replace("WORLD", "guy");
        System.out.println(s); // HELLO guy

        s = s.concat("!");
        System.out.println(s); // HELLO guy!

        System.out.println("John".toUpperCase()); // JOHN

        String y = "Hello world".toUpperCase().replace("WORLD", "guy").concat("!");
        System.out.println(y); // HELLO guy!

        System.out.println("Hello".charAt(0)); // H

        System.out.println(y.length()); // 10
        System.out.println(y.startsWith("HE")); // true
        System.out.println(y.endsWith("!")); // true
        System.out.println(y.equals("Hello guy!")); // false
        System.out.println(y.equalsIgnoreCase("Hello guy!")); // true
        System.out.println(y.contains("guy")); // true
        System.out.println(y.substring(6)); // guy!

        String name = "John";
        int points = 10;
        String phrase = String.format("Hello %s! Você ganhou %d pontos!", name, points);
        System.out.println(phrase); // Hello John! Você ganhou 10 pontos!
    }
}
