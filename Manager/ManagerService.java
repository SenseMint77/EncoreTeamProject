package EncoreTeamProject.Manager;

import java.util.Scanner;

public interface ManagerService {
	public void ConfirmRequest(Scanner sc);		//���� table���� ��� Ȯ��
	public void InsertDBData(Scanner sc);		//������ id, pw ���
	public void DeleteDBData(Scanner sc);		//������ id pw ����
	public void UpdateDBDate(Scanner sc);		//������ id pw ����
}
