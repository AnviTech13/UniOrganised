
package uniorganised;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnDb {

   
    public static Connection conLink () throws SQLException{
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost","university","project");
            return(con);
    
    }    
            
            
    
}
