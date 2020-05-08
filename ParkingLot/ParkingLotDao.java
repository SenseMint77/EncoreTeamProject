package EncoreTeamProject.ParkingLot;

public interface ParkingLotDao {
	public void Insert(ParkingLotVO pvo);				//������ data insert
	public void Delete(int seq);				//������ data delete
	public ParkingLotVO Select(int seq);		//������ data select
	public ParkingLotVO SelectAll();		//������ data select
	public void Update(ParkingLotVO pvo);				//������ data update
}
