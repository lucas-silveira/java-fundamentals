package abstractclasses;

public class Main {
    public static void main(String[] args) {
        Civic civicCar = new Civic();

        civicCar.turnOn();
        civicCar.turnOff();
        System.out.println(civicCar.getMaxSpeed() + "km");
    }
}
