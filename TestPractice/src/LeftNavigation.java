
public class LeftNavigation {
	FormPanel formpanel1;
	FormPanel formPanel2;
	
	LeftNavigation()
	{
	
		FormComponentItems[] formComponentitemName1 = new FormComponentItems[]{new FormComponentItems("TextArea               ","        label"),new FormComponentItems("This is Textarea","       TextArea"), new FormComponentItems("Text                 ","       TextBox")};
		formpanel1 = new FormPanel(formComponentitemName1);
		FormComponentItems[] formComponentitemName2 = new FormComponentItems[]{new FormComponentItems("Please enter any two digits   ","textbox")};
		formPanel2 = new FormPanel(formComponentitemName2);
	}
	void display()
	{
		formpanel1.display();
		formPanel2.display();
	}
	

}
