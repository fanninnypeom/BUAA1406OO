
public class TimeException extends Exception{
	private String detail="";
	public String getDetail	() {
		return detail;
	}
	public TimeException(int i){
		if(i==1)
		detail="�������е�ʱ��˳������";
		else
		detail="��һ�����󷢳���ʱ�����Ϊ0!";
	}

	
}
