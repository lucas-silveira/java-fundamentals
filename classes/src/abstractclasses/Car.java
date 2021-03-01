package abstractclasses;

public abstract class Car {
    void turnOn() {
        System.out.println("O carro ligou");
    }

    void turnOff() {
        System.out.println("O carro desligou");
    }

    public abstract int getMaxSpeed();
}
