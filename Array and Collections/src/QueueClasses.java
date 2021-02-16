import java.util.LinkedList;
import java.util.Queue;

public class QueueClasses {
    public static void main(String[] args) {
        // Não existe uma classe com o nome Queue, e sim uma interface
        // LinkedList é uma classe que implementa a interface Queue
        Queue<String> queue = new LinkedList<>();

        queue.add("Mary"); // Este método retorna uma exceção caso a fila esteja cheia (filas com limites)
        queue.offer("Anny"); // Este método sempre retorna um boolean

        queue.add("Carl");
        queue.add("Alice");
        queue.add("John");
        queue.add("Steve");

        System.out.println(queue.peek()); // Obtém o próximo elemento da fila. Se a fila estiver vazia, retorna um null.
        System.out.println(queue.peek()); // O resultado é o mesmo que o anterior, pois a leitura da fila não exclui o dado.
        System.out.println(queue.element()); // Comportamento semelhante ao método peek(). A diferença é que se a fila
        // estiver vazia, ele retornará uma exceção.
        System.out.println(queue.poll()); // Obtém o próximo elemento da fila e o exclui. Retorna null se a fila estiver vazia.
        System.out.println(queue.poll()); // Any
        System.out.println(queue.poll()); // Carl
        System.out.println(queue.remove()); // Comportamento semelhante ao método poll(). A diferença é que se a fila
        // estiver vazia, ele retornará uma exceção.

        System.out.println(queue.contains("John")); // true
        System.out.println(queue.size()); // 2

        queue.clear();

        System.out.println(queue.isEmpty()); // true
        System.out.println(queue); // []
    }
}
