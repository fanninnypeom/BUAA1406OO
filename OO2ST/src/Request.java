
public class Request {
	private int RequestFlag;//0������¥������1�������������-1���������
	private int Direction;//¥����������з���0�������£�1�������ϣ�-1����Ϊ����������
	private int AimFloor;//Ŀ��¥��,��Ϊ¥��������Ϊ-1
	private int RequestFloor;//���󷢳����ڵ�¥�㣬��Ϊ������������Ϊ-1
	private int Time;
	public Request(){
		RequestFlag=-1;
	}
	public Request(int a[]){//¥������Ĺ��� ������������¥���࣬���Ҳ��ò���д��һ�����캯��
		try{
		setRequestFlag(0);
		setDirection(a[0]);
		setAimFloor(-1);
		setRequestFloor(a[1]);
		setTime(a[2]);
		}catch(Exception e){
			System.out.println("��ʽ����");
			System.exit(0);
		}
	}
	public Request(String str){//��������Ĺ��캯��
		String[] str1=str.split("[(,)]");
		if(str1[1].equals("FR")){
			try{
			RequestFlag=0;
			AimFloor=-1;
			RequestFloor=Integer.parseInt(str1[2]);
			if(str1[3].equals("UP"))
				Direction=1;
			else if(str1[3].equals("DOWN"))
				Direction=0;
			else{
				System.out.println("��ʽ����");
				System.exit(0);
			}
			Time=Integer.parseInt(str1[4]);
			} catch(NumberFormatException e){
				
			}
		}
		else if(str1[1].equals("ER")){
			try{
			setRequestFlag(1);	
			setRequestFloor(-1);
			setAimFloor(Integer.parseInt(str1[2]));
			setDirection(-1);
			setTime(Integer.parseInt(str1[3]));
			} catch(NumberFormatException e){
				System.out.println("��ʽ����");
				System.exit(0);
			}
		}
		else{
			System.out.println("��ʽ����");
			System.exit(0);
		}
	}
	public int getRequestFlag() {
		return RequestFlag;
	}
	public void setRequestFlag(int requestFlag) {
		RequestFlag = requestFlag;
	}
	public int getDirection() {
		return Direction;
	}
	public void setDirection(int direction) {
		Direction = direction;
	}
	public int getAimFloor() {
		return AimFloor;
	}
	public void setAimFloor(int aimFloor) {
		AimFloor = aimFloor;
	}
	public int getRequestFloor() {
		return RequestFloor;
	}
	public void setRequestFloor(int requestFloor) {
		RequestFloor = requestFloor;
	}
	public int getTime() {
		return Time;
	}
	public void setTime(int time) {
		Time = time;
	}
}
