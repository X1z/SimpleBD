package database.connection;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by X1z on 12.02.2016.
 */
public class DBWork {

    private final String URL = "jdbc:mysql://localhost:3306/mydbtest?autoReconnect=true&useSSL=false";
    private final String PASS = "root";
    private final String LOGIN = "root";
    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public DBWork() {
        try {
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URL,LOGIN,PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
