import java.util.function.*;

public class CalcTest {
    public static void main(String[] args) {
        ICalculeFunction calc = (x, y) -> x + y;
        System.out.println(calc.apply(2, 2)); // 4.0

        // with block
        calc = (x, y) -> {
            double result = x + y;
            return result;
        };
        System.out.println(calc.apply(2, 2)); // 4.0

        // Interfaces Default
        Supplier<String> sayHello = () -> "Hello World!";
        System.out.println(sayHello.get()); // Hello World!

        Consumer<String> sayHelloFor = (name) -> {
            System.out.println("Hello " + name + "!");
        };
        sayHelloFor.accept("John"); // Hello John!

        UnaryOperator<Double> unaryOperator = x -> x;
        System.out.println(unaryOperator.apply(2.0)); // 2.0

        DoubleFunction calc2 = x -> 2 * x;
        System.out.println(calc2.apply(2)); // 4.0

        DoubleBinaryOperator calc3 = (x, y) -> x + y;
        System.out.println(calc3.applyAsDouble(2, 2)); // 4.0

        BinaryOperator<Integer> calc4 = (x, y) -> x + y;
        System.out.println(calc4.apply(2, 2)); // 4

        BiFunction<Integer, Double, Double> calc5 = (x, y) -> x * y;
        System.out.println(calc5.apply(2, 2.0)); // 4.0
    }
}
