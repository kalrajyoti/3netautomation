
public class FormComponentItems {
	String labalname;
	String type;
	
	FormComponentItems(String labalname,String type)
	{
		this.labalname = labalname;
		this.type = type;
	}
	
	void display()
	{
		System.out.println(labalname + "\t\t\t\t"+ type);
		
	}

}
