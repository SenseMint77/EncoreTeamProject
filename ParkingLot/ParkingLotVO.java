package EncoreTeamProject.ParkingLot;

import java.time.format.DateTimeFormatter;

public class ParkingLotVO {
	private static ParkingLotVO parkingLot = new ParkingLotVO(); // ���� ��ü�� �������� ���ϰ� singleton ���
	private ParkingLotVO(){}
	public static ParkingLotVO getInstance(){
		return parkingLot;										//������ ��ü ��ȯ
	}

	private final int smallCarParkingFee = 500;		//������ ���
	private final int middleCarParkingFee = 700;	//������ ���
	private final int largeCarParkingFee = 1000;	//������ ���
	
	DateTimeFormatter inputTime, outputTime;
	public DateTimeFormatter getInputTime() {
		return inputTime;
	}
	public void setInputTime(DateTimeFormatter inputTime) {
		this.inputTime = inputTime;
	}
	public DateTimeFormatter getOutputTime() {
		return outputTime;
	}
	public void setOutputTime(DateTimeFormatter outputTime) {
		this.outputTime = outputTime;
	}
	@Override
	public String toString() {
		return "ParkingLotVO [inputTime=" + inputTime + ", outputTime=" + outputTime + "]";
	}
	
}
