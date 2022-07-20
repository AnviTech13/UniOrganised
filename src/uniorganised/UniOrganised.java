
package uniorganised;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UniOrganised {

    
    public static void main(String[] args) throws SQLException {
        Connection con=ConnDb.conLink();
        PreparedStatement stmt=con.prepareStatement("select count(*) from login");
        ResultSet rs=stmt.executeQuery();
        rs.next();
        if(rs.getInt(1)!=0)
         new LoginWindow().setVisible(true);
        else
           new CreateUser(true).setVisible(true); 
    }
                    
}
