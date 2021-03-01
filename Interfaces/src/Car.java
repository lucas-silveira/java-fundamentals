// As classes podem implementar múltiplas interfaces
public class Car implements ISport {
    @Override
    public void turnOnTurbo() {
        System.out.println("Ligou o turbo.");
    }

    @Override
    public void turnOffTurbo() {
        System.out.println("Desligou o turbo.");
    }
}
