package EncoreTeamProject.ParkingLot;

import java.time.LocalDateTime;

public class ParkingLotVO {
	private static ParkingLotVO parkingLot = new ParkingLotVO(); // ���� ��ü�� �������� ���ϰ� singleton ���
	private ParkingLotVO(){}
	public static ParkingLotVO getInstance(){
		return parkingLot;										//������ ��ü ��ȯ
	}

	final int smallCarParkingFee = 500;		//������ ���
	final int middleCarParkingFee = 700;	//������ ���
	final int largeCarParkingFee = 1000;	//������ ���
	
	LocalDateTime inputTime, outputTime;
	int pay, carNumber;
	
	public LocalDateTime getInputTime() {
		return inputTime;
	}
	public void setInputTime(LocalDateTime inputTime) {
		this.inputTime = inputTime;
	}
	public LocalDateTime getOutputTime() {
		return outputTime;
	}
	public void setOutputTime(LocalDateTime outputTime) {
		this.outputTime = outputTime;
	}
	public int getPay() {
		return this.pay;
	}
	public void setPay(int pay){
		this.pay = pay;
	}
	public int getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}
	@Override
	public String toString() {
		return "ParkingLotVO [inputTime=" + inputTime + ", outputTime=" + outputTime + ", pay=" + pay + ", carNumber="
				+ carNumber + "]";
	}
	
	
}
