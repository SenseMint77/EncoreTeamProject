package EncoreTeamProject.Manager;

import java.util.Scanner;

public class ManagerMenu { // ������ �޴�
	private ManagerService mgservice; // ������ ����
	
	public ManagerMenu(ManagerService mgservice) {
		this.mgservice = mgservice;
	}
	
	public void run(Scanner sc) {
		boolean flag = true;
		int menu = 0;
		String str = "1.������ �ܺ������ӽõ�� ��ȸ\n  2.�ܺ������ӽõ�� ����\n  3.��ϵ� �ܺ����� ��ȸ\n  4.������ ������� ��ȸ\n  5.������� ����\n 6.��ϵ� ���� ��ȸ\n 7.�̰������������ȸ\n 8.�������ɴ�� ��ȸ\n 9.����";
		while (flag) {
			System.out.println(str);
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				//������ �ܺ������ӽõ�� ��ȸ
				break;
			case 2:	
				//�ܺ������ӽõ�� ����
				break;
			case 3:
				//��ϵ� �ܺ����� ��ȸ
				break;
			case 4:
				//������ ������� ��ȸ
				break;
			case 5:
				//������� ����
				break;
			case 6:
				//��ϵ� ���� ��ȸ
				break;
			case 7:
				//�̰������������ȸ
				break;
			case 8:
				//�������ɴ�� ��ȸ
				break;
			case 9:
				flag = false;
			}
		}
	}
}
