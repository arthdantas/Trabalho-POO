package src.connection;

//IMPORTS
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection; 

public class DatabaseConnection {
    //ATRIBUTOS
    private static final String url = "jdbc:mysql://localhost:3306/PRIMUS";
    private static final String user = "root";
    private static final String password = "root";
    private static Connection conn;

    
    public static Connection getConexao() {
        try {
            if (conn == null || conn.isClosed()) { 
                conn = DriverManager.getConnection(url, user, password);
            }
            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
