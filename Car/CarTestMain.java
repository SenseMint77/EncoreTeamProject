package EncoreTeamProject.Car;

import java.util.Scanner;

public class CarTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CarService cService = new CarServiceImpl();
		int select = 10;
		do{
			System.out.println("1.�� �Է� 10.����");
			select = sc.nextInt();
			switch(select){
			case 1:
				cService.InsertCarInfrom(sc);
				break;
			case 10:
				System.out.println("���α׷� ����");
				break;
			default:
				System.out.println("��ȣ�� �߸� �Է��Ͽ����ϴ�.");
			}
		}while(select != 10);
	}

}
