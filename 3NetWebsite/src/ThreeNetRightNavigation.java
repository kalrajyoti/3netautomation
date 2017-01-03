
public class ThreeNetRightNavigation {
	ThreeNetRightNavigationPenals newMembersPanel;
	ThreeNetRightNavigationPenals birthdayGreetingsPanel;
	ThreeNetRightNavigationPenals joiningAnniversaryPanel;
	
	
	ThreeNetRightNavigation()
	{
		String[] newMembericonList = {"Jyoti kalra","Deepu Kukreja"};
		
		newMembersPanel =   new ThreeNetRightNavigationPenals("New Members Panel",newMembericonList); 
		
		String[] birthdayGreetingsiconList  = {"Shikha","Sujata"};
		birthdayGreetingsPanel = new ThreeNetRightNavigationPenals("Birthday Greetings Panel",birthdayGreetingsiconList);
		
		String[] joiningAnniversaryiconList = {"Tapan","Pooja"};
		joiningAnniversaryPanel = new ThreeNetRightNavigationPenals("Joining Anniversary Panel",joiningAnniversaryiconList);
			
		
	}
	void display()
	{
		newMembersPanel.displayRightContentArea();
		birthdayGreetingsPanel.displayRightContentArea();
		joiningAnniversaryPanel.displayRightContentArea();
		
	}
}
