import java.util.function.Function;
import java.util.function.Predicate;

public class Composition {
    public static void main(String[] args) {
        Function<Integer, String> evenOrOdd = number -> number % 2 == 0 ? "Par" : "Ímpar";
        System.out.println(evenOrOdd.apply(32)); // Par

        Function<String, String> theResultIs = value -> "O resultado é: " + value;
        System.out.println(evenOrOdd.andThen(theResultIs).apply(32)); // O resultado é: Par
        System.out.println(theResultIs.compose(evenOrOdd).apply(32)); // O resultado é: Par

        Function<String, String> exclamation = value -> value + "!";
        System.out.println(
            evenOrOdd
                .andThen(theResultIs)
                .andThen(exclamation)
                .apply(32)
        ); // O resultado é: Par!

        Predicate<Integer> isEven = num -> num % 2 == 0;
        Predicate<Integer> hasThreeDigits = num -> num.toString().length() == 3;

        System.out.println(isEven.and(hasThreeDigits).test(124)); // true
        System.out.println(isEven.and(hasThreeDigits).negate().test(124)); // false
    }
}
