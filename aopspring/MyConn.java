package aopspring;

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
//JDBC 복습 ㅣ Connection Pool에서 JNDI방식으로 DataSource에게
// Connection을 반환 받는 코드 ~~~ 맞나요? 
public class MyConn {
	private static DataSource ds;
	static {
		InitialContext ctx;
		try {
			ctx = new InitialContext();
			ds = (DataSource) ctx.lookup("java:comp/env/jdbc/myora");
		} catch (NamingException e) {
			e.printStackTrace();
		}	
	 }
	public static Connection getDs() throws SQLException {
		return ds.getConnection();
	}
}
