
package newpackage;
import java.sql.*;
public class ConnectionPro {

    private static Connection con;
    
    public static Connection getConnection(){
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/travel","travel","travel");
            
        }catch(ClassNotFoundException | SQLException e){
        }
        return con;
   }
}

    

