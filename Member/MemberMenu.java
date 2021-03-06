package EncoreTeamProject.Member;

import java.lang.reflect.Member;
import java.util.Scanner;

import EncoreTeamProject.Car.CarService;
import EncoreTeamProject.Car.CarServiceImpl;
import EncoreTeamProject.Community.ComMenu;

public class MemberMenu {

//	private MemberService mService; 
//	private CarService cService;
	
	public MemberMenu() {
		MemberService mService = new MemberServiceImpl();
		CarService cService = new CarServiceImpl();
	}
	
	public void run(Scanner sc) {
		boolean flag = true;
		int menu = 0;
		String str = "1.자차조회\n  2.입출차시간조회\n  3.주차요금조회\n  4.주차요금정산\n  5.외부차량임시등록\n 6.자차등록신청\n 7.pw수정\n 8.전화번호수정\n 9.커뮤니티\n 10.종료";
		while (flag) {
			System.out.println(str);
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				cService.ShowCarInformById(sc);
				break;
			case 2:	
				mService.inOutTime(sc);
				break;
			case 3:
				mService.printParkingFee(sc);
				break;
			case 4:
				mService.payParkingFee(sc);
				break;
			case 5:
				mService.insertTempCar(sc);
				break;
			case 6:
				mService.insertMyCar(sc);
				break;
			case 7:
				mService.editPW(sc);
				break;
			case 8:
				mService.editPhoneNum(sc);
				break;
			case 10:
				mService.CarDataAccept(sc);
				break;
			case 11:
				mService.OutCarDataAccept(sc);
				break;
			case 9:
				com.run(sc);
				break;
			case 10:
				flag = false;
			}
		}
	}
	public void run2 (Scanner sc){
		boolean flag = true;
		int menu = 0;		
		String str = "1.로그인 2.회원가입 3.종료";
		while(flag){
			System.out.println(str);
			menu = sc.nextInt();
			switch(menu){
			case 1:			
				if(mService.login(sc)==1){
					run(sc);				
				}
				break;
			case 2:
				mService.signUp(sc);
				break;
			case 3: 
				flag = false;
			}
		}
	}
}
