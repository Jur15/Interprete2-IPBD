package interpretebd;

import java.sql.*;

/**
 *
 * @author Jurgenn
 */
public class InterpreteBD {

    public MainWindow ventana;

    public InterpreteBD() {
        ventana = new MainWindow();
        ventana.setVisible(true);
    }

    public void conectarBD(String serverName, String userName, String userPass, String databaseName) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
            // line below needs to be modified to include the database name, user, and password (if any)
            Connection con = DriverManager.getConnection("jdbc:sqlserver://" + serverName + ":1433;databaseName=" + databaseName + ";user=" + userName + ";password=" + userPass);
            System.out.println("Connected to database !");

        } catch (SQLException sqle) {
            System.out.println("Sql Exception :" + sqle.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found Exception :" + e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InterpreteBD main = new InterpreteBD();
        main.conectarBD("localhost", "TestUser", "12345", "Test");
    }

}
