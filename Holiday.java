package question1;

public class Holiday {
	
	private String name;
	private int day;
	private String month;
	
	public Holiday(String name, int day, String month) {
		super();
		this.name = name;
		this.day = day;
		this.month = month;
		
		
		
	}
	
	
public void inSameMonth()  {
	
	String m = "October";
	
boolean same = (month==m);

if(same)

{
	System.out.println(true);
}
else
	System.out.println(false);
}
}
	


