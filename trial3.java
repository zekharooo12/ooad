import java.sql.*;
class MysqlCon {
            public static void main(String args[]) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aarzz", "root", "Aarya@123");
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery("select * from customer");
                    while (rs.next())
                        System.out.println(rs.getInt("id")+"  "+rs.getString("firstname")+"  "+rs.getString("lastname"));
                    con.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }





