package modelo;
import java.sql.*;
/**
 * @author Diego
 * @version 15/06/2016, diego lucas romero
 */


public class conexionSQL {
  private static String  host = "79.148.236.236";  
    private String db = "dam9_bar";
    private String user = "dam9";
    private String password = "salesianas";
    private String url = "jdbc:mysql://"+host+"/"+db;
    private Connection conn = null;

   /** Constructor de clase */
   public conexionSQL(){
        this.url = "jdbc:mysql://79.148.236.236/"+this.db;
       try{
         //obtenemos el driver de para mysql
         Class.forName("com.mysql.jdbc.Driver");
         //obtenemos la conexión
         conn = DriverManager.getConnection( this.url, this.user , this.password );         
      }catch(SQLException e){
         System.err.println( e.getMessage() );
      }catch(ClassNotFoundException e){
         System.err.println( e.getMessage() );
      }
   }

/**
 * obtener conexion
 * @return  
 */
   public Connection getConexionSQL()
   {
    return this.conn;
   }

}