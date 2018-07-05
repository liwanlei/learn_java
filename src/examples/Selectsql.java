/**
 * 
 */
package examples;
/**
 * @author lileilei
 *Selectsql.java
*2018年7月4日
 */
/**
 * 
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
public class Selectsql {
	public String Chaxun(String sql_xuju ,String ziduan) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "";	
		}
		String url="jdbc:mysql://localhost:3306/fangqq";
		Connection connection;
		try {
			connection=DriverManager.getConnection(url, "root", "liwanlei");
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery(sql_xuju);
			if (resultSet.next()) {
				return resultSet.getString(ziduan);
			}
			statement.close();
			connection.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return "";	
		}
		return "";	
	}
	public String Change(String sql,Integer index,String password) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		String url="jdbc:mysql://localhost:3306/fangqq";
		Connection connection;
		try {
			connection=DriverManager.getConnection(url, "root", "liwanlei");
			Statement statement=connection.createStatement();
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(index, password);
			preparedStatement.executeUpdate();
			return "ok";
			}
		catch (Exception e) {
			e.printStackTrace();
		}
		return url;
	}
	public String Adddate(String sql) throws SQLException {
		Date aDate=new Date();
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		String url="jdbc:mysql://localhost:3306/fangqq";
		Connection connection=DriverManager.getConnection(url, "root", "liwanlei");
		try {
			connection=DriverManager.getConnection(url, "root", "liwanlei");
			Statement statement=connection.createStatement();
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.addBatch();
			preparedStatement.executeBatch();
			connection.setAutoCommit(false);
			preparedStatement.close();
			connection.close();
			return "ok";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
}
