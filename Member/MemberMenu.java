package EncoreTeamProject.Member;

import java.util.Scanner;

public class MemberMenu {
	private MemberService mservice; // ������ ����
	
	public MemberMenu(MemberService mservice) {
		this.mservice = mservice;
	}
	
	public void run(Scanner sc) {
		boolean flag = true;
		int menu = 0;
		String str = "1.������ȸ\n  2.�������ð���ȸ\n  3.���������ȸ\n  4.�����������\n  5.�ܺ������ӽõ��\n 6.������Ͻ�û\n 7.����";
		while (flag) {
			System.out.println(str);
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				//������ȸ
				break;
			case 2:	
				//�������ð���ȸ
				break;
			case 3:
				//���������ȸ
				break;
			case 4:
				//�����������
				break;
			case 5:
				//�ܺ������ӽõ��
				break;
			case 6:
				//������Ͻ�û
				break;
			case 7:
				flag = false;
			}
		}
	}
}
