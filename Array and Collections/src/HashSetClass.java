import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class HashSetClass {
    public static void main(String[] args) {
        // Não existe uma classe com o nome Set, e sim uma interface
        // HashSet é uma classe que implementa a interface Set
        // É recomendado evitar conjuntos heterogêneos
        HashSet aVariedSet = new HashSet();
        aVariedSet.add(1.2); // double -> Double
        aVariedSet.add(true); // boolean -> Boolean
        aVariedSet.add("Anything");
        aVariedSet.add(1); // int -> Integer
        aVariedSet.add('a'); // char -> Character

        System.out.println(aVariedSet); // [1.2, 1, a, Anything, true]
        System.out.println(aVariedSet.size()); // 5
        aVariedSet.add(1); // valor repetido
        System.out.println(aVariedSet.size()); // 5

        HashSet<Double> aSetDouble = new HashSet<>();

        aSetDouble.add(1.2);
        aSetDouble.add(1.4);

        System.out.println(aSetDouble); // [1.2, 1.4]
        System.out.println(aSetDouble.remove(1.2)); // true
        System.out.println(aSetDouble.contains(1.4)); // true

        HashSet<Double> aSetDouble1 = new HashSet<>();
        HashSet<Double> aSetDouble2 = new HashSet<>();

        aSetDouble1.add((double) 1);
        aSetDouble1.add(1.2);

        aSetDouble2.add(1.4);
        aSetDouble2.addAll(aSetDouble1); // união dos conjuntos

        System.out.println(aSetDouble2); // [1.4, 1.0, 1.2]

        aSetDouble2.retainAll(aSetDouble); // interseção dos conjuntos

        System.out.println(aSetDouble2); // [1.4]

        aSetDouble2.clear();

        System.out.println(aSetDouble2); // []

        // Sem ordenação
        // HashSet<Double> aSetDouble3 = new HashSet();

        // Com ordenação
        SortedSet<Double> aSetDouble3 = new TreeSet();

        aSetDouble3.add(1.0);
        aSetDouble3.add(1.2);
        aSetDouble3.add(1.4);
        aSetDouble3.add(1.5);
        aSetDouble3.add(1.6);

        for (Double number : aSetDouble3) {
            System.out.println(number);
        }
    }
}
