package EncoreTeamProject.Car;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import p0429.DataBaseConnect;

public class CarDaoImpl implements CarDao {
	private DataBaseConnect db;
	public CarDaoImpl(){
		db = DataBaseConnect.getInstance();
	}
	@Override
	public void Insert(CarVO cvo) {
		// TODO Auto-generated method stub
		
		String sql = "insert into car values(?,?,?,?,?,?,?)";
		//1. db Ŀ�ؼ� ����
		Connection conn = db.getConnect();
		try {
			//2. Ŀ�ؼ� ��ü�� ������Ʈ��Ʈ ��ü ����
			PreparedStatement pstmt = conn.prepareStatement(sql);
			//3. sql���� ? ����
			pstmt.setInt(1, cvo.getCarNum());
			pstmt.setString(2, cvo.getId());
			pstmt.setString(3, cvo.getCarColor());
			pstmt.setString(4, cvo.getCarSize());
			pstmt.setDate(5, java.sql.Date.valueOf(LocalDate.now()));
			pstmt.setInt(6, cvo.isGuest() ? 1 : 0);
			pstmt.setInt(7, cvo.isPayed() ? 1 : 0);
			//4. ���� ����
			pstmt.executeUpdate();		//���� ���� , executeQuere => �б� ���� select�� ���
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void Delete() {
		// TODO Auto-generated method stub
	}

	@Override
	public CarVO Select() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<CarVO> SelectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Update() {
		// TODO Auto-generated method stub

	}

}
