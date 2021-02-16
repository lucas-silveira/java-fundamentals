package list;

import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        // Não existe uma classe com o nome List, e sim uma interface
        // ArrayList é uma classe que implementa a interface List
        ArrayList<User> list = new ArrayList();
        User user1 = new User("John");
        User user2 = new User("Alice");

        list.add(user1);
        list.add(new User("Mary"));
        list.add(user2);
        list.add(new User("Steve"));
        list.add(new User("Carl"));

        System.out.println(list.get(3)); // Seleção por índice
        System.out.println("---");

        for (User user : list) {
            System.out.println(user); // Chamando implicitamente o método toString()
        }

        list.remove(1); // Remoção por índice. Retorna o objeto removido.

        // O método abaixo necessita que o objeto User tenha o HashCode e o equals implementado.
        // Entretando, a classe ArrayList não necessita do HashCode.
        list.remove(user1); // Remoção pelo objeto. Retorna um boolean.

        System.out.println("---");

        for (User user : list) {
            System.out.println(user);
        }

        System.out.println("---");

        // O método abaixo necessita que o objeto User tenha o HashCode e o equals implementado,
        // caso contrário, o resultado será false.
        // Entretando, a classe ArrayList não necessita do HashCode.
        System.out.println(list.contains(user2)); // true
    }
}
