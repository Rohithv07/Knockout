import java.io.*;
import java.sql.*;
import java.util.*;
public class DBHandler {
    private static Connection con = null;
    private static Properties props = new Properties();

public Connection establishConnection() throws ClassNotFoundException, SQLException {
    
    try{
        FileInputStream fis = null;
        fis = new FileInputStream("db.properties");
        props.load(fis);
        Class.forName(props.getProperty("db.classname"));
        con = DriverManager.getConnection(props.getProperty("db.url"), props.getProperty("db.username"), props.getProperty("db.password"));
    }
    catch(IOException e){
        e.printStackTrace();
    }
    return con;
   
}
}
