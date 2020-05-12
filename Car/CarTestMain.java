package EncoreTeamProject.Car;
import java.util.Scanner;

public class CarTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CarService cService = new CarServiceImpl();
		int select = 10;
		do{
			System.out.println("1.�� �Է�  2.���� 3.��ü �� ��� 4.�� ��ȣ�� �˻� 5.���̵�� �˻� 6.���� ���� ���� 10.����");
			select = sc.nextInt();
			switch(select){
			case 1:
				cService.InsertCarInform(sc);
				break;
			case 2:
				cService.DeleteCarInform(sc);
				break;
			case 3:
				cService.ShowAllCarInform();
				break;
			case 4:
				cService.ShowCarInformBynum(sc);
				break;
			case 5:
				cService.ShowCarInformById(sc);
				break;
			case 6:
				cService.UpdateCarInform(sc);
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
