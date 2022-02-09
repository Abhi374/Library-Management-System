package Project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import oracle.jdbc.OracleDriver;

public class ConnectionProvider {
    public static Connection getCon()
     {
       try{
//          Class.forName("oracle.jdbc.OracleDriver");
          Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl", "c##scott", "tiger");
          return con;
          }
       catch(Exception a)
        {
            System.out.println(a);
            return null;
        }
     }
  }
