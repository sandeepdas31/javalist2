import java.sql.*; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class sql {   
	void show() {  
	try{  
	Class.forName("com.mysql.jdbc.Driver");  
	Connection con=DriverManager.getConnection(  
	"jdbc:mysql://localhost/sandeep","root","");  
	//here sonoo is database name, root is username and password  
	Statement stmt=con.createStatement();  
	ResultSet rs=stmt.executeQuery("select * from table1");  
	while(rs.next())  
	System.out.println(rs.getString(1)+"  "+rs.getString(2)+" "+rs.getString(3));  
	con.close();  
	}catch(Exception e){ System.out.println(e);}  }
	public static void main(String[] args) {
		sql s=new sql();
		s.show();
	
	}

}