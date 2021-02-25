public class Game {
    public static void main(String[] args) {
        Player player1 = new Player();
        player1.walk(Direction.NORTH);
        player1.walk(Direction.EAST);

        System.out.println(player1.toString()); // { x: 1, y: 1 }
    }
}
