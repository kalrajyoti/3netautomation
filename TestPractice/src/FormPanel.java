
public class FormPanel {
	
	FormComponentItems[] formComponentitemName;
	
	
	FormPanel(FormComponentItems[] formComponentitemName)
	{
		this.formComponentitemName =formComponentitemName;
		
		
		formComponentitemName = new FormComponentItems[]{new FormComponentItems("TextArea               ","label"),new FormComponentItems("This is Textarea","TextArea"), new FormComponentItems("Text                 ","TextBox")};
	}
	void display()
	{
		for(int count=0;count<formComponentitemName.length;count++)
		{
			formComponentitemName[count].display();
			
		}
	}
	
	
	
	
	
	
	

}
