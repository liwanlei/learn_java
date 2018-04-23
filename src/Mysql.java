/**
 * 
 */
import java.sql.*;
import java.util.Date;
import org.omg.CORBA.PUBLIC_MEMBER;
/**
 * @author Administrator
 *
 */
public class Mysql {
	public void Chaxun() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		String url="jdbc:mysql://localhost:3306/beijing";//jabc的路径
		Connection connection;
		try {
			connection=DriverManager.getConnection(url, "root", "liwanlei");
			Statement statement=connection.createStatement();
			String sql="select * from student where id=1";
			ResultSet resultSet=statement.executeQuery(sql);
			if (resultSet.next()) {
				System.out.println(resultSet.getString("name"));
			}
			statement.close();
			connection.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}	
	}
	public void Change() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("异常");
		}
		String url="jdbc:mysql://localhost:3306/beijing";//jabc的路径
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
			System.out.println("异常");
		}
	}
	public void Adddate() {
		Date aDate=new Date();
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("加载驱动失败");
		}
		String url="jdbc:mysql://localhost:3306/beijing";
		Connection connection;
		try {
			connection=DriverManager.getConnection(url, "root", "liwanlei");
			Statement statement=connection.createStatement();
			String sql="insert into student (id,name,age,address) values (?,?,?,?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			for(int i=1;i<10;i++){
				preparedStatement.setInt(1, i);
				preparedStatement.setString(2, "liwanddlei"+i);
				preparedStatement.setInt(3, i*333);
				preparedStatement.setString(4, "beijiddng"+i);
				preparedStatement.executeUpdate();
			}
			preparedStatement.close();
			connection.close();
			Date date=new Date();
			System.out.println((date.getTime()-aDate.getTime()));
			System.out.println("插入慕成功");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mysql mysql=new Mysql();
		mysql.Chaxun();
	}
}
