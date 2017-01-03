import com.test.ParentForAll;


public class ThreeNetLeftNavigationMenu extends ParentForAll {
	
	ThreeNetLeftNavigationMenu(String leftNavigationPanelmenus)
	{
		this.name=leftNavigationPanelmenus;
	}
	public void display()
	{
		System.out.println(name);
	}
}
