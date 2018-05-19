import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import model.Person;

/**
 * Created by Michał on 2018-05-14.
 */
public class Launcher {

    public static void main(String[] args) {

        ObjectContainer database = Database.getDatabase();
        //database.store(person);

        ObjectSet<Person> objects = database.queryByExample(Person.class);

        for(Person o : objects) {
            System.out.println(o.toString());

        }

        database.close();
    }
}
