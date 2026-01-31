public class DatabaseService {

    public void connect() {
        String connectionString = AppConfig.CONNECTION_STRING;
        System.out.println("Connecting to database with: " + connectionString);
    }
}
