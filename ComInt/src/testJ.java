import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class testJ {
public void server(double P,double i,int N,int m,double F) throws ClassNotFoundException, SQLException {
		
		String name = "root";
		String pwd = "zzy999";
		String url = "jdbc:mysql://localhost_3306/compound";
		
		//Class.forName("com.mysql.jdbc.Driver");
	    Class.forName("org.gjt.mm.mysql.Driver");
		
		Connection conn = DriverManager.getConnection(url,name,pwd);
		String sql = "select * from calculation";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next())
		{
			//P=rs.getString(P);
		}
		
		
		/*String sql1 = "insert into calculation(P,i,N,m,F) values (1000.0,0.03,10,1,0)";
		PreparedStatement pstmt = conn.prepareStatement(sql1);
		//P,i,N,m,F
		pstmt.setDouble(1,P);
		pstmt.setDouble(2,i);
		pstmt.setInt(3,N);
		pstmt.setInt(4,m);
		pstmt.setDouble(5,F);
		///pstmt.executeUpdate(); 
		pstmt.executeUpdate(sql1);*/
		
//		try 
//		{
//			
//		} catch (Exception e) 
//		{
//			// TODO: handle exception
//		}finally
//		{
//			if(rs.next())
//			{
//				
//			}
//			else
//			{
//				
//				
//			}
//		}
//		
		
		rs.close();
		stmt.close();
		conn.close();
	}

}
