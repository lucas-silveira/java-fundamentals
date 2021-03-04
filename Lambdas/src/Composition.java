import java.util.function.Function;

public class Composition {
    public static void main(String[] args) {
        Function<Integer, String> evenOrOdd = number -> number % 2 == 0 ? "Par" : "Ímpar";
        System.out.println(evenOrOdd.apply(32)); // Par

        Function<String, String> theResultIs = value -> "O resultado é: " + value;
        System.out.println(evenOrOdd.andThen(theResultIs).apply(32)); // O resultado é: Par

        Function<String, String> exclamation = value -> value + "!";
        System.out.println(
            evenOrOdd
                .andThen(theResultIs)
                .andThen(exclamation)
                .apply(32)
        ); // O resultado é: Par!
    }
}
