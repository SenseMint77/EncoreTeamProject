package EncoreTeamProject.Member;

import java.util.ArrayList;
import java.util.Scanner;

import EncoreTeamProject.Car.CarDao;
import EncoreTeamProject.Car.CarDaoImpl;
import EncoreTeamProject.Car.CarVO;
import EncoreTeamProject.ParkingLot.ParkingLotDao;
import EncoreTeamProject.ParkingLot.ParkingLotDaoImpl;
import EncoreTeamProject.ParkingLot.ParkingLotService;
import EncoreTeamProject.ParkingLot.ParkingLotServiceImpl;
import EncoreTeamProject.ParkingLot.ParkingLotVO;

public class MemberServiceImpl implements MemberService {
	private MemberDao mDao;
	private CarDao cDao;
	private ParkingLotVO pvo;
	private ParkingLotDao pDao;
	private ParkingLotService pService;
	
	public MemberServiceImpl() {
		mDao = new MemberDaoImpl();
		cDao = new CarDaoImpl();
		pvo = new ParkingLotVO();
		pDao = new ParkingLotDaoImpl();
		pService = new ParkingLotServiceImpl();
	}

	public MemberServiceImpl(MemberDaoImpl memberDaoImpl) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addMember(Scanner sc) {
		// TODO Auto-generated method stub
		String id = " ";
		String pw = " ";
		int phoneNum = 0;
		int register = 0;
		
		System.out.println("동호수로 id를 입력하세요. 예: 101동 101호 => 1010101, 201동 2501호 => 2012501");
		id = sc.next();
		System.out.println("pw를 입력하세요");
		pw = sc.next();
		System.out.println("전화번호를 입력하세요");
		phoneNum = sc.nextInt();
		
		mDao.insert(new MemberVO(id, pw, phoneNum, register));
	}

	@Override
	public void printMember(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("멤버의 id를 입력하세요.");
		String id = sc.next();
		MemberVO m = mDao.selectByID(id);
		if (m == null) {
			System.out.println("존재하지 않는 id를 입력했습니다.");
		} else {
			System.out.println(m);
		}
	}

	@Override
	public void printAll() {
		// TODO Auto-generated method stub
		ArrayList<MemberVO> memberList = mDao.selectAll();
		for (MemberVO m : memberList) {
			System.out.println(m);
		}
	}

	@Override
	public void editPW(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("pw를 수정할 id를 입력하세요.");
		String id = sc.next();
		MemberVO m = mDao.selectByID(id);
		if (m==null) {
			System.out.println("입력한 id가 존재하지 않습니다.");
		} else {
			System.out.println("수정할 pw를 입력하세요.");
			String newPW = sc.next();
			mDao.updatePW(m, newPW);
		}
	}

	@Override
	public void editPhoneNum(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("전화번호를 수정할 id를 입력하세요.");
		String id = sc.next();
		MemberVO m = mDao.selectByID(id);
		if (m==null) {
			System.out.println("입력한 id가 존재하지 않습니다.");
		} else {
			System.out.println("수정할 전화번호를 입력하세요.");
			int phoneNum = sc.nextInt();
			mDao.updatePhoneNum(m, phoneNum);
		}
	}
	
	@Override
	public void editRegister(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("가입승인여부를 수정할 id를 입력하세요.");
		String id = sc.next();
		MemberVO m = mDao.selectByID(id);
		if (m==null) {
			System.out.println("입력한 id가 존재하지 않습니다.");
		} else {
			System.out.println("가입승인여부를 입력하세요. 승인은 1, 미승인은 0을 입력하세요.");
			int register = sc.nextInt();
			mDao.updateRegister(m, register);
		}
	}

	@Override
	public void delMember(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("삭제할 멤버의 id를 입력하세오.");
		String id = sc.next();
		mDao.delete(id);
	}

	@Override
	public void inOutTime(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("입출차시간을 조회할 차번호를 입력하세오.");
		int carNum = sc.nextInt();
		ParkingLotVO pvo = pDao.SelectByCarnumforParkingLot(carNum);
		System.out.println("들어온 시간 : " + pvo.getInputTime());
		System.out.println("나간 시간 : " + pvo.getOutputTime());
		/*pDao.SelectInTime(carNum);
		pDao.SelectOutTime(carNum);*/
	}

	@Override
	public void printParkingFee(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("주차요금을 조회할 차번호를 입력하세오.");
		
		int charge = pvo.getPay();
		System.out.println("주차요금은 " + charge + "원 입니다.");
	}

	@Override
	public void payParkingFee(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("주차요금을 정산할 차번호를 입력하세오.");
		int carNum = sc.nextInt();
		pService.Settlement(sc, pDao.SelectByCarnumforParkingLot(carNum));
	}

	@Override
	public void insertTempCar(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("외부차량임시등록을 진행합니다.");
		int number = 0;
		String carColor = "r";
		String carSize = "s";
		boolean guest = true;
		boolean isPayed = false;
		String id = "abcd";
		
		System.out.println("차번호를 입력하시오");
		number = sc.nextInt();
		System.out.println("차 색깔을 입력하시오");
		carColor = sc.next();
		System.out.println("차 크기를 입력하시오");
		carSize= sc.next();
		System.out.println("id 입력");
		id = sc.next();
		
		cDao.Insert(new CarVO(number, carColor, carSize, id, guest, isPayed));
	}

	@Override
	public void insertMyCar(Scanner sc) {
		// TODO Auto-generated method stub
		int number = 0;
		String carColor = "r";
		String carSize = "s";
		boolean guest = false;
		boolean isPayed = false;
		String id = "abcd";
		
		System.out.println("차번호를 입력하시오");
		number = sc.nextInt();
		System.out.println("차 색깔을 입력하시오");
		carColor = sc.next();
		System.out.println("차 크기를 입력하시오");
		carSize= sc.next();
		System.out.println("id 입력");
		id = sc.next();
		
		cDao.Insert(new CarVO(number, carColor, carSize, id, guest, isPayed));
		
	}

	@Override
	public void CarDataAccept(Scanner sc) {
		// TODO Auto-generated method stub

		int number;
		ArrayList<CarVO> carList = mDao.SelectAllInsider();
		for (CarVO car : carList) {
			System.out.println(car);
		}
		System.out.println("Please input car number for approving");
		number = sc.nextInt();
		mDao.GrantCar(number);
		System.out.println("Approved!!");
	}

	@Override
	public void OutCarDataAccept(Scanner sc) {
		// TODO Auto-generated method stub
		int number;
		ArrayList<CarVO> carList = mDao.SelectAllOutRequ();
		for (CarVO car : carList) {
			System.out.println(car);
		}
		System.out.println("Please input car number for approving");
		number = sc.nextInt();
		mDao.GrantCar(number);
		System.out.println("Approved!!");
		
	}

	@Override
	public void PrintAllOutCarData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void PrintAllCarData() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void signUp(Scanner sc) {
		MemberVO m = new MemberVO();
		System.out.println("입주민 등록 신청");
		while (true) {

			System.out.print("id:");
			String id = sc.next();
			if (mDao.checkId(id) == 1) {
				m.setId(id);
				break;
			} else {
				System.out.println("이미 있는 id입니다.다시 입력해주세요.");
			}
		}
		System.out.print("pwd:");
		m.setPw(sc.next());

		System.out.println("phonenum:");
		m.setPhoneNum(sc.nextInt());
		mDao.insertSignUp(m);
	}

	@Override
	public int login(Scanner sc) {
		MemberVO m = new MemberVO();

		while (true) {
			System.out.print("id:");
			String id = sc.next();
			MemberVO v = mDao.selectByID(id);
			if (v == null) {
				System.out.println("잘못된 id입니다.다시입력하세요.");

			} else if (id.equals(v.getId())) {
				m.setId(id);
				System.out.print("pw:");
				String pw = sc.next();
				
				if (pw.equals(v.getPw())) {
					m.setPw(pw);
					if(v.getRegister()==1){
						System.out.println("로그인 성공~");
						return 1;
					}else{
						System.out.println("관리인의 수락 필요합니다.");
						return -1;
					}
					
				} else {
					System.out.println("틀린 pwd입니다. 다시 입력하세요.");
				}
			}
		}

	}
	

}
