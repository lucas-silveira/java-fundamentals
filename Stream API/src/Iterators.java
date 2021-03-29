import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.stream.Stream;

public class Iterators {
    public static void main(String[] args) {
        List<String> approveds = Arrays.asList("John", "Clark", "Ben", "Alice");

         // Common way to iterating a list
        System.out.println("Common way to iterating a list");
        for (String name : approveds) {
            System.out.println(name);
        }

        // With Iterator
        System.out.println("\nWith Iterator");
        Iterator<String> iterator = approveds.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // With Stream
        System.out.println("\nWith Stream");
        Stream<String> stream = approveds.stream();

        stream.forEach(System.out::println);
    }
}
