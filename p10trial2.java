import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class p10trial2{

        public static void main(String args[]){
                //condition
                try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con= DriverManager.getConnection(
                                "jdbc:mysql://localhost:3306/sampledb","root","Aarya@123");

                        Statement stmt=con.createStatement();
                        String query = "select p10a.fullname,p10b.coursename from sampledb.p10a,sampledb.p10b where p10a.cid=p10b.id and p10b.coursename="+"\"OOAD\""+ "or p10b.coursename="+"\"DSA\"";
                        ResultSet rs=stmt.executeQuery(query);

                        while(rs.next())
                                System.out.println(rs.getString(1)+"  "+rs.getString(2));
                        con.close();
                }catch(Exception e){ System.out.println(e);}
        }
}
