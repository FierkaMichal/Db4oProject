package model;

/**
 * Created by Michał on 2018-05-16.
 */
public class Sedan extends Car {

    private int maxSpeed;

    public Sedan(int seats, String name, boolean isMoving, int maxSpeed) {
        super(seats, name, isMoving);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        isMoving = true;
        System.out.println("Jade sedanem");
    }
    @Override
    public void changeDirection() {
        System.out.println("Zmieniam kierunek sedana");
    }

    @Override
    public void brake() {
        isMoving = false;
        System.out.println("Hamuje sedanem");
    }

    @Override
    public void openDoors() {
        if (super.isMoving) {
            brake();
        }
        System.out.println("Otwieram drzwi sedanowi");
    }

    @Override
    public void closeDoors() {
        System.out.println("Zamykam drzwi sedanowi");
    }

    public void fastenChildSeat() {
        System.out.println("Zapinam foteliki w sedanie");
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "maxSpeed=" + maxSpeed +
                ", seats=" + seats +
                ", name='" + name + '\'' +
                ", isMoving=" + isMoving +
                '}';
    }
}
