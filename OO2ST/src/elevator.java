
public class elevator {
	private int Floor;
	private int Status; //0�����½�����ǰfloor,1������������ǰfloor
	private int inertance;//���ݵĹ���,0Ϊ��������,1Ϊ��������
	private double Time;//��ǰʱ��
	public elevator(){
		Floor=1;
		Time=0;
	}
	public void PrintRunningRecord(){
		System.out.print("(");
		System.out.print(Floor+", ");
		if(Status==1)
			System.out.print("UP, ");
		else if(Status==0)
			System.out.print("DOWN, ");
		System.out.print(Time);
		System.out.println(")");
	}
	public void GetInstruction(int instr,double d){
		Floor=Floor+instr;
		if(d>Time)
			Time=d;
		if(instr<0)
			Status=0;
		else if(instr>0)
			Status=1;
		Time=Time+0.5*Math.abs(instr)+1;

	}
	public int getFloor() {
		return Floor;
	}
	public void setFloor(int floor) {
		Floor = floor;
	}
	public double getTime() {
		return Time;
	}
	public void setTime(double time) {
		Time = time;
	}

}
