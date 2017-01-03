
public class ThreeNetBody {
	
	ThreeNetLeftNavigation threeNetLeftNavigationItems;
	ThreeNetRightNavigation threeNetRightNavigationItems;
	ThreeNetMainContentArea threeNetMainContentArea;
	ThreeNetBody()
	{
		threeNetLeftNavigationItems = new ThreeNetLeftNavigation();
		threeNetRightNavigationItems = new ThreeNetRightNavigation();
		threeNetMainContentArea = new ThreeNetMainContentArea();
	}
	
	
	void displayBoday()
	{
		threeNetLeftNavigationItems.displayLeftNavigation();
		threeNetRightNavigationItems.display();
		threeNetMainContentArea.display();
	}
	

}
