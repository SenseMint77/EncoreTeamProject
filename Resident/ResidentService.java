package EncoreTeamProject.Resident;

import java.util.ArrayList;
import java.util.Scanner;

import EncoreTeamProject.Car.CarVO;

public interface ResidentService {
	public ArrayList<CarVO> SearchMyCar(Scanner sc);		//���� �˻�
	public ResidentVO SearchMyInform(Scanner sc);		//���� �˻�
	public void InformRequest(Scanner sc);				//������ ��Ͽ�û
	public void CarRequest(Scanner sc);					//���� ��� ��û
	public void RequestGuest(Scanner sc);				//�մ� �湮 ��û
}
