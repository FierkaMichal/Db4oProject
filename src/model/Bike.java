package model;

/**
 * Created by Michał on 2018-05-17.
 */
public class Bike implements Vehicle {

    private String bikeNumber;

    public Bike(String bikeNumber) {
        this.bikeNumber = bikeNumber;
    }

    @Override
    public void drive() {
        System.out.println("Jade rowerem");
    }

    @Override
    public void changeDirection() {
        System.out.println("Zmieniam kierunek roweru");
    }

    @Override
    public void brake() {
        System.out.println("Hamuje rowerem");
    }

    public String getBikeNumber() {
        return bikeNumber;
    }

    public void setBikeNumber(String bikeNumber) {
        this.bikeNumber = bikeNumber;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "bikeNumber='" + bikeNumber + '\'' +
                '}';
    }
}
