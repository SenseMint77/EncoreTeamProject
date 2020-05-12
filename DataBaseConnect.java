package EncoreTeamProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnect {
	private static DataBaseConnect db = new DataBaseConnect();
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:EncoreTeamProject";
	private DataBaseConnect(){}
	public static DataBaseConnect getInstance(){
		return db;
	}
	public Connection getConnect(){		//db�ý��ۿ� ����
		Connection conn = null;
		try {
			Class.forName(driver);		//driver load
			conn = DriverManager.getConnection(url, "charrles", "7276");	//db ������ �ּ�, ����, ��й�ȣ�� �̿��Ͽ� ���Ǽ���
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
