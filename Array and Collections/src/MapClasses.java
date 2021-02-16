import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapClasses {
    public static void main(String[] args) {
        // Não existe uma classe com o nome Map, e sim uma interface
        // HashMap é uma classe que implementa a interface Map
        Map<Integer, String> users = new HashMap<>();

        // Adiciona ou substitui o valor.
        users.put(1, "John");
        users.put(2, "Mary");
        users.put(3, "Alice");
        users.put(4, "Carl");

        System.out.println(users.get(1)); // John

        users.put(1, "Steve");

        System.out.println(users.get(1)); // Steve
        System.out.println(users.size()); // 3
        System.out.println(users.isEmpty()); // false
        System.out.println(users.keySet()); // [1, 2, 3]
        System.out.println(users.values()); // [Steve, Mary, Alice]
        System.out.println(users.entrySet()); // [1=Steve, 2=Mary, 3=Alice]
        System.out.println(users.containsKey(1)); // true
        System.out.println(users.containsValue("Steve")); // true
        System.out.println(users.get(1)); // Steve
        System.out.println(users.remove(4)); // Carl
        System.out.println(users.remove(3, "Kane")); // Remover a partir da chave e valor.

        // A conversão de Integer para int é permitida
        for (int key : users.keySet()) {
            System.out.println(key);
        }

        for (String value : users.values()) {
            System.out.println(value);
        }

        for (Entry<Integer, String> user : users.entrySet()) {
            System.out.println(user);
        }

        for (Entry<Integer, String> user : users.entrySet()) {
            System.out.printf("ID: %d, Nome: %s\n", user.getKey(), user.getValue());
        }
    }
}
