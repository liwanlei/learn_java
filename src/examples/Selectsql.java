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
import java.sql.*;
import java.util.Date;

import com.sun.corba.se.pept.transport.EventHandler;
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
	public void Change() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("�쳣");
		}
		String url="jdbc:mysql://localhost:3306/beijing";//jabc��·��
		Connection connection;
		try {
			connection=DriverManager.getConnection(url, "root", "liwanlei");
			Statement statement=connection.createStatement();
			String sql="UPDATE student SET name=? WHERE id=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, "liwanlei");
			preparedStatement.setInt(2, 1);
			preparedStatement.executeUpdate();
			System.out.println("ok");}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("�쳣");
		}
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
