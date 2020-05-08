package EncoreTeamProject.Car;

import java.time.LocalDateTime;
import java.util.Scanner;

public class CarServiceImpl implements CarService {
	private CarDao cDao;
	public CarServiceImpl(){
		cDao = new CarDaoImpl();
	}
	@Override
	public void InsertCarInfrom(Scanner sc) {
	
		// TODO Auto-generated method stub
		
		int number = 0;
		String carColor = "r";
		String carSize = "s";
		boolean guest = false;
		boolean isPayed = false;
		String id = "abcd";
		
		System.out.println("����ȣ�� �Է��Ͻÿ�");
		number = sc.nextInt();
		System.out.println("�� ������ �Է��Ͻÿ�");
		carColor = sc.next();
		System.out.println("�� ũ�⸦ �Է��Ͻÿ�");
		carSize= sc.next();
		System.out.println("�մ�? true, false");
		guest = sc.nextBoolean();
		System.out.println("��޳��ο���? true, false");
		isPayed = sc.nextBoolean();
		System.out.println("id �Է�");
		id = sc.next();
		
		cDao.Insert(new CarVO(number, carColor, carSize, id, guest, isPayed));
		System.out.println("������ �Է� ����");
		
	}

}
