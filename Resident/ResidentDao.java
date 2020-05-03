package EncoreTeamProject.Resident;

import java.util.ArrayList;

public interface ResidentDao {
	public void Insert();						//���ֹ� db insert
	public void Delete();						//���ֹ� db delte
	public ResidentVO Select();					//���ֹ� db select
	public ArrayList<ResidentVO> SelectAll();	
	public void Update();						//���ֹ� db update
}
