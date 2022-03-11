
package ahmadirfaanhibatullah.spring.core;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: Database.java, v 0.1 2022‐03‐11 09.57 Ahmad Irfaan Hibatullah Exp $$
 */
public class Database {

    private static Database database;

    public static Database getInstance() {
        if (database == null) {
            return database = new Database();
        }

        return database;
    }

    private Database() {

    }
}