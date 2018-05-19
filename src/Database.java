import com.db4o.Db4o;
import com.db4o.ObjectContainer;

/**
 * Created by Michał on 2018-05-17.
 */
public class Database {

    private static ObjectContainer db;

    public static ObjectContainer getDatabase() {
        if(db == null) {
            db = Db4o.openFile("baza");
            db.ext().configure().messageLevel(2);
        }
        return db;
    }

    private Database() {
    }

}
