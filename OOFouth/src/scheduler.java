
public class scheduler {
	private int instr;
	private int Floor;
	private int Status; //0�����½�����ǰfloor,1������������ǰfloor
	private double Time;//��ǰʱ��
	public void GiveOutInstr(Request req){
		if(req.getRequestFlag()==0){
			setInstr(req.getRequestFloor()-Floor);
			setTime(req.getTime());
		}
		else if(req.getRequestFlag()==1){
			setInstr(req.getAimFloor()-Floor);
			setTime(req.getTime());
		}
		else{
			System.out.println("������");
			System.exit(0);
		}
	}
	public int getInstr() {
		return instr;
	}
	public void setInstr(int instr) {
		this.instr = instr;
	}
	public double getTime() {
		return Time;
	}
	public void setTime(double time) {
		Time = time;
	}
	public int getFloor() {
		return Floor;
	}
	public void setFloor(int floor) {
		Floor = floor;
	}

}

