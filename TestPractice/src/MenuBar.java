
public class MenuBar {
	Menuitems[] menuitems;
	
	
	MenuBar()
	{
		menuitems = new Menuitems[] {new Menuitems("Home"), new Menuitems("Tutorials"),new Menuitems("PRACTICE")};
	}
	
	public String toString()
	{
		String returnValue = "";
		
		for(int count =0;count<menuitems.length;count++)
		{
			returnValue= returnValue + menuitems[count].menuItemsName;
		}
		return returnValue;
		
	}
	void display()
	{
		for(int count =0;count<menuitems.length;count++)
		{
		menuitems[count].display();
		
		}
		
		
	}

}
