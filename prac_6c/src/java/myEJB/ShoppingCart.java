package myEJB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Remove;
import javax.ejb.Stateful;
import javax.management.Query;
@Stateful
public class ShoppingCart {
List<String> content;
private final Connection con = null;
private Statement stmt = null;
String customerName;
String query = null;
private ResultSet rs;


public void initialize(String person)
    {
        content = new ArrayList<>();
        if (person != null) 
        {
            customerName = person ;
        } 
        try {
            Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mysql?allowPublicKeyRetrieval=true&useSSL=false","root","mittal123");
        } catch (Exception e) 
        {
            System.err.println(e);
        }}
 
public void addBook(String title)
    {
        try {
           stmt = con.createStatement();
           String query = "update from cart where username= "+customerName+"and ItemName= "+title+"";
           stmt.executeUpdate(query);
        } catch (SQLException e) 
        {
            System.err.println(e);
        }
                
    }
public void removeBook(String title)
    {
        try {
            stmt = con.createStatement();
          query = "delete from cart where username= "+customerName+"and ItemName= "+title+"";
           stmt.executeUpdate(query);
        } catch (SQLException e) 
        {
            System.err.println(e);
        }
                
    }
public List<String> getcontent()
{
    try {
        stmt = con.createStatement();
        query = "select * from cart where username="+customerName+"";
        rs =  stmt.executeQuery(query);
        while (rs.next()) 
        {            
            content.add(rs.getString("ItemName"));
        }
    } catch (Exception e) {}
    return content;
}
@Remove()
public void remove()
{
    content = null;
}

}

