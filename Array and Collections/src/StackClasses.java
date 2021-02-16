import java.util.ArrayDeque;
import java.util.Deque;

public class StackClasses {
    public static void main(String[] args) {
        // Não existe uma classe com o nome Stack, e sim uma interface com o nome Deque
        // ArrayDeque é uma classe que implementa a interface Deque
        Deque<String> books = new ArrayDeque<>();

        // Adiciona um elemento ao final da stack.
        // Retorna true se a adição for bem sucedida, caso contrário lança uma exceção.
        // books.add("O pequeno príncipe"); // ou addLast()

        // Adiciona um elemento no início da stack.
        // Comportamento semelhante ao método add();
        //books.push("Dom Quixote"); // ou addFirst()

        // Adiciona um elemento ao final da stack.
        // A diferença deste método para o add é que ele sempre retorna um boolean.
        // books.offer("O Hobbit"); // ou offerLast()

        books.addFirst("O Pequeno Príncipe"); // ou addLast()
        books.addFirst("Dom Quixote"); // ou addFirst()
        books.addFirst("O Hobbit"); // ou offerLast()

        System.out.println(books); // [O Hobbit, Dom Quixote, O pequeno príncipe]
        System.out.println(books.peek()); // O Hobbit
        System.out.println(books.element()); // O Hobbit
        System.out.println(books.poll()); // O Hobbit | ou pollFirst()
        System.out.println(books.pop()); // Dom Quixote | | ou removeFirst()
        System.out.println(books.remove()); // O Pequeno Príncipe | ou removeFirst()
        System.out.println(books); // []

        // books.size();
        // books.clear();
        // books.contains();
        // books.isEmpty();
    }
}
