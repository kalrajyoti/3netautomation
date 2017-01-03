
public class ThreeNetLeftNavigation {
	
	ThreeNetLeftNavigationMenu[] threeNetRightNavigationMenu;
	
	ThreeNetLeftNavigation()
	{
		threeNetRightNavigationMenu = new ThreeNetLeftNavigationMenu[] { new ThreeNetLeftNavigationMenu("Attendance"), new ThreeNetLeftNavigationMenu("Cab Service"),new ThreeNetLeftNavigationMenu("Cafeteria"),
		new ThreeNetLeftNavigationMenu("Discussion"),new ThreeNetLeftNavigationMenu("Evaluate"),new ThreeNetLeftNavigationMenu("Help Desk"),new ThreeNetLeftNavigationMenu("HW Requisitions"),
		new ThreeNetLeftNavigationMenu("Leave Management"),new ThreeNetLeftNavigationMenu("Other Utilities"),new ThreeNetLeftNavigationMenu("Reimbursement"),new ThreeNetLeftNavigationMenu(" Team Survey")};
	}
	
	void displayLeftNavigation()
	{
		System.out.println("<------Left Navigation panel of 3Net started------------>");
		for( int count =0; count<threeNetRightNavigationMenu.length;count++)
		{
			threeNetRightNavigationMenu[count].display();
		}
		System.out.println("<------Left Navigation panel of 3Net finished------------>");
	}
}
