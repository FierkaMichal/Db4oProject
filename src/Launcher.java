import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import model.Person;
import model.Vehicle;

/**
 * Created by Michał on 2018-05-14.
 */
public class Launcher {

    public static void main(String[] args) {

        ObjectContainer database = Database.getDatabase();
//        for(int i = 0; i < 100; ++i) {
//            database.store(ObjectFactory.createPerson());
//        }

        ObjectSet<Person> objects = database.queryByExample(Person.class);

//        for(Person o : objects) {
//            System.out.println(o.toString());
//        }

        ObjectSet<Person> adams = database.queryByExample(new Person("Adam"));

        while(adams.hasNext()) {
            Person person = adams.next();
            System.out.println("\n\n" + person.toString());
            for(Vehicle sedan : person.getSedans()) {
                sedan.drive();
                sedan.changeDirection();
                sedan.brake();
            }
        }
        database.close();
    }
}