package Service.database;

import java.util.Properties;

public class DBConfig {
    private static final String USERNAME = "adri";
    private static final String PASSWORD = "1234";
    private static final String TABLE = "pruebaAED";
    public static final String URL = "jdbc:mysql://localhost";
    private static final String PORT= "3306";




    public static Properties getProperties(){
        Properties properties = new Properties();
        properties.setProperty("password", PASSWORD);
        properties.setProperty("user", USERNAME);
        properties.setProperty("url", URL);
        properties.setProperty("port", PORT);

        System.getenv().get("");

        return properties;
    }

}

