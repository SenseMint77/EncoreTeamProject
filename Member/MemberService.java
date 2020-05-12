package EncoreTeamProject.Member;

import java.util.Scanner;

public interface MemberService {

	// ����� ���
	public void addMember(Scanner sc);

	// ����� �˻�(ID)�ؼ� ���
	public void printMember(Scanner sc);

	// ����� ��ü ��� ���
	public void printAll();

	// ����� ����(ID �޾Ƽ� PW ����)
	public void editPW(Scanner sc);

	// ����� ����(ID �޾Ƽ� ��ȭ��ȣ ����)
	public void editPhoneNum(Scanner sc);

	// ����� ����(ID �޾Ƽ� ���Խ��ο��� ����)
	public void editRegister(Scanner sc);

	// ID �Է� �޾Ƽ� ����
	public void delMember(Scanner sc);

	// �������ð���ȸ
	public void inOutTime(Scanner sc);

	// ���������ȸ
	public void printParkingFee(Scanner sc);

	// �����������
	public void payParkingFee(Scanner sc);

	// �ܺ������ӽõ��
	public void insertTempCar(Scanner sc);

	// ������Ͻ�û
	public void insertMyCar(Scanner sc);

	public void CarDataAccept(Scanner sc); // ������

	public void OutCarDataAccept(Scanner sc); // �ܺ���������

	public void PrintAllOutCarData(); // �ܺ��������������

	public void PrintAllCarData(); // �������� ���� �����
	// public void PrintMydetail();

//	public void PrintOwnCarData(); // �ܺ��� ��ȸ (�ڱ�)
//
//	public void PrintOwnOutCarData(); // ������ ��ȸ(�ڱ�)
}