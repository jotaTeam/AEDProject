package Service;

import java.sql.ResultSet;

import static Service.statement.Statements.executeQuery;
import static Service.statement.Statements.executeUpdate;

public class Service {

    private ResultSet rs;

    public ResultSet getAll(String table) {

        String sql = "SELECT * FROM guerritas." + table + ";";

        rs = executeQuery(sql);

        return rs;


    }

    public ResultSet getById(int id, String table) {

        String sql = "SELECT * FROM guerritas." + table + " WHERE id_" + table + " = " + id + ";";

        rs = executeQuery(sql);

        return rs;

    }


    public int delete(int id, String table) {


        String sql = "DELETE FROM guerritas." + table + " WHERE id_" + table + " = " + id + ";";

        int i = executeUpdate(sql);

        return i;


    }

    public int create(String table, String value) {

        String sql = "INSERT INTO guerritas." + table + " VALUES( null, '" + value + "');";

        int i = executeUpdate(sql);

        return i;

    }

    public int create(String table, String value1, String value2, String value3) {

        String sql = "INSERT INTO guerritas." + table + " VALUES(null, '" + value1 + "', '" + value2 + "','" + value3 + "');";

        int i = executeUpdate(sql);

        return i;

    }

    public int create(String table, String value1, String value2, String value3, String value4) {

        String sql = "INSERT INTO guerritas." + table + " VALUES(null, '" + value1 + "', '" + value2 + "','" + value3 + ",'" + value4 + "');";

        int i = executeUpdate(sql);

        return i;

    }


    public int update(int id, String table, String columnName, String newValue) {

        String sql = "UPDATE guerritas." + table + " SET " + columnName + " = '" + newValue + "' WHERE id_" + table + " = " + id + ";";

        int i = executeUpdate(sql);

        return i;


    }

    public int update(int id, String table, String columnName1, String columnName2, String columnName3, String newValue1, String newValue2, String newValue3) {

        String sql = "UPDATE guerritas." + table +
                " SET "
                + columnName1 + " = '" + newValue1 + "'," +
                "" + columnName2 + " = '" + newValue2 + "'," +
                "" + columnName3 + " = '" + newValue3 + "'" +
                " WHERE id_" + table + " = " + id + ";";

        int i = executeUpdate(sql);

        return i;


    }

    public int update(int id, String table, String columnName1, String columnName2, String columnName3, String columnName4,
                      String newValue1, String newValue2, String newValue3, String newValue4) {

        String sql = "UPDATE guerritas." + table +
                " SET "
                + columnName1 + " = '" + newValue1 + "'," +
                "" + columnName2 + " = '" + newValue2 + "'," +
                "" + columnName3 + " = '" + newValue3 + "'," +
                "" + columnName4 + " = '" + newValue4 + "'" +
                " WHERE id_" + table + " = " + id + ";";

        int i = executeUpdate(sql);

        return i;


    }

}




