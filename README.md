# AEDProject

## Configuraciones iniciales
para un correcto funcionamiento debemos de modificar el siguiente archivo para que la conexion con la base de datos sea correcta

[`src/Service/database/DBConfig`](./src/Service/database/DBConfig.java)

```java
import java.util.Properties;

public class DBConfig {
    private static final String USERNAME = "root";  // tu usuario
    private static final String PASSWORD = "";      // tu password
    private static final String TABLE = "guerritas"; 
    public static final String URL = "jdbc:mysql://localhost"; //url de conexion
    private static final String PORT= "3306";       // puerto por defecto




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

```

## BORRAR CARPETA OUT

Es posible que si lanzamos el programa por primera vez nos de un fallo

Para solucionar este problema solo tenemos que borrar la carpeta

`out/`

una vez que tenemos la caropeta borrada podemos volver a compilar el proyecto y este no deberia de dar problema


## update y delete

para realizar esta accion en cualquier tabla debemos seleccionar primero un registro de los que sale en tabla

y luego debemos pichar en los botones de modificar o borrar



