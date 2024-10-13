package realestate;
import java.sql.Connection;
import java.sql.DriverManager;
public class Database {
   Connection con = null;
    
     public static Connection ConnectionDB (){
         try{
             Class.forName("org.sqlite.JDBC");
             Connection con = DriverManager.getConnection("jdbc:sqlite:F:\\RealEstate\\ClientInformation.db");
             System.out.println("Connection succeeded");
             return con;
        }catch (Exception e){
            System.out.println("Connection failed" +e);
            return null;
        }
     }  
}
