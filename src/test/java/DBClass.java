import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBClass {
    @Test
    public void DBClass() throws Exception {

        Class.forName("oracle.jdbc.driver.OraccleDriver");
        Connection con= DriverManager.getConnection("Connection String with UN PWD");
        Statement smt=con.createStatement();
        ResultSet rs=smt.executeQuery("Query");
        rs.next();
        String Msisdn=rs.getString(1);
        String Bam=rs.getString(2);
    }
}
