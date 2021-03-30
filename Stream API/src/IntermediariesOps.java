import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class IntermediariesOps {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;

        // Map
        List<String> brands = Arrays.asList("BMW ", "Audi ", "Ferrari ");

        brands.stream().map(brand -> brand.toUpperCase()).forEach(print);
        // o método forEach é uma Terminal Operation

        System.out.println("");

        UnaryOperator<String> toUppperCase = word -> word.toUpperCase();
        UnaryOperator<String> firstLetter = word -> word.charAt(0) + "";
        UnaryOperator<String> addExclamation = word -> word + "! ";

        // Map with composition
        brands.stream().map(toUppperCase).forEach(print);

        System.out.println("");

        brands.stream()
                .map(toUppperCase)
                .map(firstLetter)
                .map(addExclamation)
                .forEach(print);
    }
}
