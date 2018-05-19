import model.*;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Created by Michał on 2018-05-19.
 */
public class ObjectFactory {

    private static String[] names = {"Adam", "Jakub", "Michał", "Paweł", "Jan", "Tadeusz", "Mateusz", "Anna", "Marysia", "Ola"};
    private static String[] cities = {"Warszawa", "Poznań", "Kraków", "Gdańsk", "Lublin", "Wrocław", "Sopot"};
    private static String[] streets = {"Mickiewicza", "Narutowicza", "Słoneczna", "Banacha", "Pasteura", "Pogorzelskiego", "Wawelska"};
    private static String[] sedanNames = {"BMW 3", "Audi A5", "Toyota Auris", "VW Polo", "KIA Oprius", "Mercedes E"};

    public static Person createPerson() {
        Person person = new Person();
        person.setName(names[getRandomInt(0, names.length - 1)]);
        person.setBirthday(randomDate());
        person.setAddress(getRandomAddress());
        person.setVehicles(getRandomVehicles());

        return person;
    }

    private static int getRandomInt(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }

    private static Date randomDate() {
        LocalDate localDate = LocalDate.now().minus(Period.ofDays((new Random().nextInt(365 * 70))));
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    private static Address getRandomAddress() {
        Address address = new Address(Country.getRandomCountry(),
                cities[getRandomInt(0, cities.length-1)],
                streets[getRandomInt(0, streets.length-1)],
                getRandomInt(0, 100));
        return address;
    }

    private static List<Vehicle> getRandomVehicles() {
        List<Vehicle> vehicles = new ArrayList<>();

        for (int i = 0; i < getRandomInt(0, 3); ++i) {
            vehicles.add(new Sedan(getRandomInt(2, 7), sedanNames[getRandomInt(0, sedanNames.length-1)], new Random().nextBoolean(), getRandomInt(100, 250)));
        }
        for(int i = 0; i < getRandomInt(0, 2); ++i) {
            vehicles.add(new Bike(String.valueOf(getRandomInt(1000, 9999))));
        }
        return vehicles;
    }
}
