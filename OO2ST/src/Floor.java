
public class Floor {
	private int FloorID;
	private int Status;//0�������µİ�ť������1�������ϵİ�ť������-1����û�б���
	public Floor(int ID,int status){
		FloorID=ID;
		Status=status;
	}
	public int GetStatus(int ID){
		if(ID==FloorID)
			return Status;
		else
			return -2;
	}
}
