package beerPackage.repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {






    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://moktok.intecbrussel.org:33062/JAVAJANNihat",
                "JAVAJANNihat", "Nihat2022");





    }
}
