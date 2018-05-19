package model;

/**
 * Created by Michał on 2018-05-16.
 */
public abstract class Car implements Vehicle {

    public int seats;
    public String name;
    public boolean isMoving;

    public Car(int seats, String name, boolean isMoving) {
        this.seats = seats;
        this.name = name;
        this.isMoving = isMoving;
    }

    public abstract void openDoors();
    public abstract void closeDoors();
}
