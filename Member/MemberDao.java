package EncoreTeamProject.Member;

import java.util.ArrayList;

import EncoreTeamProject.Car.CarVO;

public interface MemberDao {
	public void insert(MemberVO m); // ����� ���� �Է�

	public void delete(String id); // ����� ����

	public MemberVO selectByID(String id); // ����� ����(id)

	public ArrayList<MemberVO> selectAll(); // ����� ��ü ����

	void updatePW(MemberVO m, String newPW);

	void updatePhoneNum(MemberVO m, int phoneNum);

	void updateRegister(MemberVO m, int register);

	public void GrantCar(int number);

	public ArrayList<CarVO> SelectAllInsider();

	public ArrayList<CarVO> SelectAllOutsider();

//	public ArrayList<CarVO> SelectAllRequ();
//
//	public ArrayList<CarVO> SelectAllOutRequ();
}
