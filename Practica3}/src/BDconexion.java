import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class BDconexion {
    public static String DRIVER = "com.mysql.jdbc.Driver";
    public static String USUARIO = "root";
    public static String PASSWORD = "";
    public static String URL = "jdbc:mysql://localhost:3306/bd_alumnos";
    
    static{
        try{
            Class.forName(DRIVER);
        }
        catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"Error en el Driver "+e);
        }
    }
    public Connection getConnection(){
      Connection conexion = null; 
      try{
        conexion = DriverManager.getConnection(URL,USUARIO,PASSWORD);
        JOptionPane.showMessageDialog(null,"Conexion exitosa");
      }
      catch(SQLException e){
          JOptionPane.showMessageDialog(null, "Error en la conexion "+e);
      }
      return conexion;
    } 
}
