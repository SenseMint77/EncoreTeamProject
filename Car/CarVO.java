package EncoreTeamProject.Car;

import java.time.format.DateTimeFormatter;

public class CarVO {
	private int carNum;							//����ȣ
	private String color, size;					//�� ����, ũ��
	private DateTimeFormatter enrollDate;		//�������
	private boolean guest;						//�湮�� ���� �湮���Ͻ� true, ���ֹ��ϰ�� false
	public CarVO(){}
	public CarVO(int carNum, String color, String size, DateTimeFormatter enrollDate, boolean guest){
		this.carNum = carNum;
		this.color = color;
		this.size = size;
		this.enrollDate = enrollDate;
		this.guest = guest;
	}
	public int getCar() {
		return carNum;
	}
	public void setCar(int car) {
		this.carNum = car;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public DateTimeFormatter getEnrollDate() {
		return enrollDate;
	}
	public void setEnrollDate(DateTimeFormatter enrollDate) {
		this.enrollDate = enrollDate;
	}
	public boolean getGuest() {
		return guest;
	}
	public void setGeust(boolean external) {
		this.guest = external;
	}
	@Override
	public String toString() {
		return "CarVO [car=" + carNum + ", color=" + color + ", size=" + size + ", enrollDate=" + enrollDate
				+ ", external=" + guest + "]";
	}
	
}
