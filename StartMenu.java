package EncoreTeamProject;

import java.util.Scanner;

import EncoreTeamProject.Member.MemberDao;
import EncoreTeamProject.Member.MemberDaoImpl;
import EncoreTeamProject.Member.MemberService;
import EncoreTeamProject.Member.MemberServiceImpl;
//import EncoreTeamProject.Member.Menu;

public class StartMenu {
	MemberDao mDao;
	MemberService mService;
	//Menu menu;
	
	
	public StartMenu() {
	}
	
	public void run(Scanner sc) {
		boolean flag = true;
		int menu = 0;
		String str = "1.�α���\n 2.���ֹΰ��Խ�û\n 3.����";
		while (flag) {
			System.out.println(str);
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				login(sc);
				break;
			case 2:
				register(sc);
				break;
			case 3:
				flag = false;
			}
		}
	}
	
	public void login(Scanner sc) {
	    String id;
	    String pw;
	    System.out.println("Log in : ");
	    System.out.println("id: ");
	    id = sc.next();
	    System.out.println("pw: ");
	    pw = sc.next();
	    
	    MemberDaoImpl mdi = new MemberDaoImpl();
	    //Menu m = new Menu();
	    if (mdi.selectByID(id) != null && ((mdi.selectByID(id)).getPw()).equals(pw) && ((mdi.selectByID(id)).getRegister()==1) ) {
	    	System.out.println("You are logged in");
	    	//m.run(sc);
	    } else if (mdi.selectByID(id) != null && ((mdi.selectByID(id)).getPw()).equals(pw) && ((mdi.selectByID(id)).getRegister()==0) ) {
	    	System.out.println("���� ������ ���� ���� �ʾҽ��ϴ�.");
	    } else if (mdi.selectByID(id) == null) {
	    	System.out.println("�������� �ʴ� id�Դϴ�.");
	    } else if (mdi.selectByID(id) != null && !((mdi.selectByID(id)).getPw()).equals(pw) ) {
	    	System.out.println("pw�� Ʋ�Ƚ��ϴ�.");
		} else {
	    	System.out.println("�ٽ� Ȯ���ϰ� id�� pw�� �Է��ϼ���.");
	    }
	    return;
	}
		
	public void register(Scanner sc) {
		MemberService mservice = new MemberServiceImpl();
		mservice.addMember(sc);
		System.out.println("���ֹ� ���Խ��ν�û�� �Ϸ�Ǿ����ϴ�.");
		
	}
}
