public class LoggingService {

    public void log(String message) {
        String connectionString = AppConfig.CONNECTION_STRING;
        System.out.println("Logging to DB with: " + connectionString);
        System.out.println("Log message: " + message);
    }
}
