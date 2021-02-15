public class EqualsAndHashCode {
    public static void main(String[] args) {
        User user1 = new User();
        user1.name = "John";
        user1.email = "john@email.com";

        User user2 = new User();
        user2.name = "John";
        user2.email = "john@email.com";

        System.out.println(user1 == user2); // false
        System.out.println(user1.equals(user2)); // se equals não for definido, seu comportamento será igual à "=="
        System.out.println(user1.hashCode()); // -1609960656
    }
}
