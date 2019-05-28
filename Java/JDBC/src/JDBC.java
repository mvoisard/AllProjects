import java.sql.*;

public class JDBC {
    public static void main(String[] args)
    {
    	try {
    		Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Database", "mvoisard", "Rookies22");
    		Statement myStmt = myConn.createStatement();
    		ResultSet myRs = myStmt.executeQuery("select * from employees");
    		while (myRs.next()) {
    			System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name"));
    		}
    	}
    	catch (Exception er) {
    		System.out.print("Error: " + er.getMessage());
    	}
    }
}
