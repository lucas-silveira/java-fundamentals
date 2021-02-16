package list;

import java.util.Objects;

public class User {
    String name;

    public User(String name) {
        this.name = name;
    }

    // Este método é usado para retornar um valor padrão ao imprimir o objeto inteiro
    public String toString() {
        return String.format("Meu nome é %s.", this.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
