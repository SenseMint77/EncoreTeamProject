package EncoreTeamProject.ParkingLot;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import p0429.DataBaseConnect;

public class ParkingLotDaoImpl implements ParkingLotDao {
	private DataBaseConnect db;
	
	public ParkingLotDaoImpl(){
		db = DataBaseConnect.getInstance();
	}
	
	@Override
	public void Insert(ParkingLotVO pvo) {
		// TODO Auto-generated method stub
		String sql = "insert into parkinglot values(parkinglotno.next,?,null,null,?)";
		//1. db Ŀ�ؼ� ����
		Connection conn = db.getConnect();
		try {
			//2. Ŀ�ؼ� ��ü�� ������Ʈ��Ʈ ��ü ����
			PreparedStatement pstmt = conn.prepareStatement(sql);
			//3. sql���� ? ����
			pstmt.setTimestamp(1, java.sql.Timestamp.valueOf(pvo.getInputTime()));
			pstmt.setInt(2, pvo.getCarNumber());
			//4. ���� ����
			pstmt.executeUpdate();		//���� ���� , executeQuere => �б� ���� select�� ���
			System.out.println("������ ���� ����");
		}catch (SQLException e) {
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
	public void Delete(int seq) {
		// TODO Auto-generated method stub

	}

	@Override
	public ParkingLotVO Select(int seq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ParkingLotVO SelectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Update(ParkingLotVO pvo) {
		// TODO Auto-generated method stub

	}

}
