import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Date;

/**
 * 
 */

/**
 * @author lileilei
 *Threadmyql.java
*2017��12��9��
 */
public class Threadmyql  extends Thread{
	@Override
	public void run() {
		Date aDate=new Date();
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("��������ʧ��");
		}
		String url="jdbc:mysql://localhost:3306/beijing";
		Connection connection;
		try {
			connection=DriverManager.getConnection(url, "root", "liwanlei");
			Statement statement=connection.createStatement();
			String sql="insert into student (id,name,age,address) values (?,?,?,?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			for(int i=1;i<100000;i++){
				preparedStatement.setInt(1, i);
				preparedStatement.setString(2, "asdasdasd"+i);
				preparedStatement.setInt(3, i*333);
				preparedStatement.setString(4, "asdasdasdasdasdasd"+i);
				preparedStatement.executeUpdate();
			}
			preparedStatement.close();
			connection.close();
			Date date=new Date();
			System.out.println((date.getTime()-aDate.getTime())/1000);
			System.out.println("����Ľ�ɹ�");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		 for (int i = 1; i <=10; i++) {
             new Threadmyql().start();
           }
		
	}

}
