<<<<<<< HEAD

package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionFactory {

  private static Connection connection = null;
  private static final String DRIVER = "org.postgresql.Driver";
  private static final String URL = "jdbc:postgresql://localhost:5432/estoque";
  private static final String USER = "postgres";
  private static final String PASSWORD = "postgres";

  public static Connection getConnection() {
    try {
      if (connection != null && !connection.isClosed()) {
        return connection;
      } else {
        try {
          Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
          e.printStackTrace();
        }
        connection = DriverManager.getConnection(URL, USER, PASSWORD);
      }
    } catch (SQLException e) {
      Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, e);
    }
    return connection;
  }
}
=======
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionFactory {

=======
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionFactory {

>>>>>>> master
  private static Connection connection = null;
  private static final String DRIVER = "org.postgresql.Driver";
  private static final String URL = "jdbc:postgresql://localhost:5432/estoque";
  private static final String USER = "postgres";
  private static final String PASSWORD = "postgres";

  public static Connection getConnection() {
    try {
      if (connection != null && !connection.isClosed()) {
        return connection;
      } else {
        try {
          Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
          e.printStackTrace();
        }
        connection = DriverManager.getConnection(URL, USER, PASSWORD);
      }
    } catch (SQLException e) {
      Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, e);
    }
    return connection;
  }
}
<<<<<<< HEAD

=======
>>>>>>> master
