package ParkingService.ParkingLot;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public interface ParkingLotService {
	public int CalculatePayment(Scanner sc);			//��� ���
	public int ShowEmptyPosNum(Scanner sc);				//���ڸ� Ȯ��
	public DateTimeFormatter ShowParkingTime(Scanner sc);	//���� �ð� ǥ��
	
}
