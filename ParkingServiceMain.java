package EncoreTeamProject;

import java.util.Scanner;

import EncoreTeamProject.Manager.ManagerMain;
import EncoreTeamProject.Resident.ResidentMain;

public class ParkingServiceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ResidentMain rMain = null;
		ManagerMain mMain = null;
		int select = 0; //asdfasdfasd
		do{
			System.out.println("1.�α��� 2.�α׾ƿ� 3.����");
			select = sc.nextInt();
			switch(select){
				case 1:
					System.out.println("���ֹ��� �����ϼ̽��ϴ�.");
					rMain = new ResidentMain();
					rMain.Run(sc);
					break;
				case 2:
					System.out.println("�������� �����ϼ̽��ϴ�.");
					mMain = new ManagerMain();
					mMain.Run(sc);
					break;
				case 3:
					System.out.println("���α׷��� �����մϴ�.");
					break;
				default:
					System.out.println("�߸��� ��ȣ ����");
					
			}			
		}while(select != 3);
		sc.close();
	}

}
