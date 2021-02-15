import java.util.Objects;

public class User {
    String name;
    String email;

    @Override
    public boolean equals(Object o) { // Object é um tipo genérico para todos os objetos
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o; // conversão de tipo
        return Objects.equals(name, user.name) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }
}
