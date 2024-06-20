package MYbean;
import javax.ejb.Stateless;
import java.sql.*;
@Stateless
public class AABean {
public AABean(){}
public String roomBook(String roomtype,String cust,String mob)
{
    String msg="";
    try{
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mysql?allowPublicKeyRetrieval=true&useSSL=false","root","mittal123");
        String abc = "select * from roombook where RoomType=? and status='Not Book'";
        PreparedStatement pst = con.prepareStatement(abc);
        pst.setString(1,roomtype);
        ResultSet rs = pst.executeQuery();
        if(rs.next()){
            String rid = rs.getString(1);
            PreparedStatement stmt1 = con.prepareStatement("update roombook set cust=? where RoomId=?");
            PreparedStatement stmt2 = con.prepareStatement("update roombook set mob=? where RoomId=?");
            PreparedStatement stmt3 = con.prepareStatement("update roombook set status=? where RoomId=?");
            stmt1.setString(1, cust);
            stmt1.setString(2, rid);
            stmt2.setString(1, mob);
            stmt2.setString(2, rid);
            stmt3.setString(1, "BOOKED");
            stmt3.setString(2, rid);
            stmt1.executeUpdate();
            stmt2.executeUpdate();
            stmt3.executeUpdate();
            msg="ROOM "+rid+" BOOKED Charges = "+rs.getString(3)+" "+rs.getString(2);
        }
        else
        {
            msg="Room "+roomtype+" NOT AVAILABLE";
        }
    } catch(Exception e) {msg=""+e;}
return msg;
}}




