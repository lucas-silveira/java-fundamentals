public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        anyMethod(car);
        car.turnOffTurbo();
    }

    public static void anyMethod(ISport carSport) {
        carSport.turnOnTurbo();
    }
}
