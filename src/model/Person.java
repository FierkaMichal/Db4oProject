package model;

import com.db4o.config.annotations.Indexed;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Michał on 2018-05-14.
 */
public class Person {

    @Indexed
    private String name;
    private Date birthday;
    private Address address;
    private List<Vehicle> vehicles;

    public Person(String name, Date birthday, Address address) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        vehicles = new ArrayList<>();
        vehicles.add(new Sedan(1, "sd", true, 132));
        vehicles.add(new Bike("sd"));
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public List<Vehicle> getSedans() {
        List<Vehicle> sedans = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Sedan) {
                sedans.add(vehicle);
            }
        }
        return sedans;
    }

    public List<Vehicle> getBikes() {
        List<Vehicle> bikes = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Bike) {
                bikes.add(vehicle);
            }
        }
        return bikes;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", address=" + address.toString() +
                ", vehicles=" + vehicles +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}
