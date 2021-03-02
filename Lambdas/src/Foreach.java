import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {
        List<String> approveds = Arrays.asList("Alice", "Clark", "Ben", "Steve");

        for (String name : approveds) {
            System.out.println(name);
        }

        System.out.println("---");

        // with lambda
        approveds.forEach(name -> { System.out.println(name); });

        System.out.println("---");

        // forward by reference
        approveds.forEach(System.out::println);
    }
}
