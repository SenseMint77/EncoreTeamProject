package EncoreTeamProject.Car;

import java.util.ArrayList;
import java.util.Scanner;

public class CarServiceImpl implements CarService {
	private CarDao cDao;
	public CarServiceImpl(){
		cDao = new CarDaoImpl();
	}
	@Override
	public void InsertCarInform(Scanner sc) {
	
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
		
	}
	@Override
	public void DeleteCarInform(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("�� ��ȣ�� �Է��ϼ���.");
		int number = sc.nextInt();
		cDao.Delete(number);
	}
	@Override
	public void ShowAllCarInform() {
		// TODO Auto-generated method stub
		ArrayList<CarVO> carList = cDao.SelectAll();
		for(CarVO car : carList){
			System.out.println(car);
		}
	}
	@Override
	public void ShowCarInformBynum(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("����ȣ�� �Է��ϼ���.");
		int carNum = sc.nextInt();
		CarVO cvo = cDao.SelectByNum(carNum);
		if(cvo == null){
			System.out.println("���� ��ȣ �Է� ����");
		} else{
			System.out.println(cvo);
		}
	}
	@Override
	public void ShowCarInformById(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("id�� �Է��ϼ���");
		String id = sc.next();
		ArrayList<CarVO> carList = cDao.SelectById(id);
		for(CarVO car : carList){
			System.out.println(car);
		}
	}
	@Override
	public void UpdateCarInform(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("������ ����ȣ�� �Է��ϼ���.");
		int carNum = sc.nextInt();
		CarVO cvo = cDao.SelectByNum(carNum);
		if(cvo == null){
			System.out.println("���� ��ȣ �Է� ����");
		} else{
			System.out.println("���� ��ȣ�� �Է��ϼ���.");
			int newNum = sc.nextInt();
			System.out.println("���� ���� �Է��ϼ���.");
			cvo.setCarColor(sc.next());
			System.out.println("���� ũ�⸦ �Է��ϼ���.");
			cvo.setCarSize(sc.next());
			System.out.println("�մ� ? true, false");
			cvo.setGuest(sc.nextBoolean());
			cDao.Update(cvo, newNum);
		}
	}
	@Override
	public void OutStandingDoc(Scanner sc) {		//parkinglot���� �̰����� ������ ����Ұ� ��� �߰�
		// TODO Auto-generated method stub
		ArrayList<CarVO> carList = cDao.selectByOutstandingDoc();
		for(CarVO car : carList){
			System.out.println(car);
		}
		System.out.println("����ȣ�� �Է��ϼ���.");
		int carNum = sc.nextInt();
		for(CarVO car : carList){
			if(car.getCarNum() == carNum){
				System.out.println("-1: ���� , 0: �ݷ�, 1: ����");
				int isAccept = sc.nextInt();
				car.setIsAccepted(isAccept);
				cDao.UpdateForProcessDoc(isAccept, carNum);			//���� update����
			}
		}
	}

}
