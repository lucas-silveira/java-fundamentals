public class Player {
    int x;
    int y;

    public void walk(Direction direction) {
        switch (direction) {
            case NORTH:
                y++;
                break;
            case SOUTH:
                y--;
                break;
            case EAST:
                x++;
                break;
            case WEST:
                x--;
                break;
            default:
        }
    }

    @Override
    public String toString() {
        return String.format("{ x: %d, y: %d }", x, y);
    }
}
