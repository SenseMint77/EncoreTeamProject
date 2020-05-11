package EncoreTeamProject.Member;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberServiceImpl implements MemberService {
	private MemberDao mDao;
	
	public MemberServiceImpl() {
		mDao = new MemberDaoImpl();
	}

	public MemberServiceImpl(MemberDaoImpl memberDaoImpl) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addMember(Scanner sc) {
		// TODO Auto-generated method stub
		String id = " ";
		String pw = " ";
		int phoneNum = 0;
		int register = 0;
		
		System.out.println("��ȣ���� id�� �Է��ϼ���. ��: 101�� 101ȣ => 1010101, 201�� 2501ȣ => 2012501");
		id = sc.next();
		System.out.println("pw�� �Է��ϼ���");
		pw = sc.next();
		System.out.println("��ȭ��ȣ�� �Է��ϼ���");
		phoneNum = sc.nextInt();
		
		mDao.insert(new MemberVO(id, pw, phoneNum, register));
	}

	@Override
	public void printMember(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("����� id�� �Է��ϼ���.");
		String id = sc.next();
		MemberVO m = mDao.selectByID(id);
		if (m == null) {
			System.out.println("�������� �ʴ� id�� �Է��߽��ϴ�.");
		} else {
			System.out.println(m);
		}
	}

	@Override
	public void printAll() {
		// TODO Auto-generated method stub
		ArrayList<MemberVO> memberList = mDao.selectAll();
		for (MemberVO m : memberList) {
			System.out.println(m);
		}
	}

	@Override
	public void editPW(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("pw�� ������ id�� �Է��ϼ���.");
		String id = sc.next();
		MemberVO m = mDao.selectByID(id);
		if (m==null) {
			System.out.println("�Է��� id�� �������� �ʽ��ϴ�.");
		} else {
			System.out.println("������ pw�� �Է��ϼ���.");
			String newPW = sc.next();
			mDao.updatePW(m, newPW);
		}
	}

	@Override
	public void editPhoneNum(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("��ȭ��ȣ�� ������ id�� �Է��ϼ���.");
		String id = sc.next();
		MemberVO m = mDao.selectByID(id);
		if (m==null) {
			System.out.println("�Է��� id�� �������� �ʽ��ϴ�.");
		} else {
			System.out.println("������ ��ȭ��ȣ�� �Է��ϼ���.");
			int phoneNum = sc.nextInt();
			mDao.updatePhoneNum(m, phoneNum);
		}
	}
	
	@Override
	public void editRegister(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("���Խ��ο��θ� ������ id�� �Է��ϼ���.");
		String id = sc.next();
		MemberVO m = mDao.selectByID(id);
		if (m==null) {
			System.out.println("�Է��� id�� �������� �ʽ��ϴ�.");
		} else {
			System.out.println("���Խ��ο��θ� �Է��ϼ���. ������ 1, �̽����� 0�� �Է��ϼ���.");
			int register = sc.nextInt();
			mDao.updateRegister(m, register);
		}
	}

	@Override
	public void delMember(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("������ ����� id�� �Է��ϼ���.");
		String id = sc.next();
		mDao.delete(id);
	}

}
