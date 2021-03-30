import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class BuiltOps {
    public static void main(String[] args) {
        // Reference value
        Consumer<String> print = System.out::print;
        Consumer<Integer> println = System.out::println;
        print.accept("hello");

        // #1 Creation Stream
        Stream<String> langsStream = Stream.of("Java ", "Javascript ", "Go\n");
        langsStream.forEach(print); // we need pass a consumer function

        // #2 Creation Stream from array
        String[] langsArray = { "Python ", "Lisp ", "Perl\n" };
        Stream.of(langsArray).forEach(print);

        // #3 Creation Stream from Arrays class
        Arrays.stream(langsArray).forEach(print);
        // with range of values
        Arrays.stream(langsArray, 1, 3).forEach(print);

        // #4 Creation Stream from Collection
        List<String> langsList = Arrays.asList("C ", "C++ ", "C#\n");
        langsList.stream().forEach(print);
        langsList.parallelStream().forEach(print); // order is not guaranteed

        // #5 Creation infinite Stream
        // Stream.generate(() -> "a").forEach(print); // infinite generation
        // Stream.iterate(0, n -> n + 1).forEach(println); // infinite generation
    }
}
