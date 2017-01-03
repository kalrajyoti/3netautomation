import com.test.ParentForAll;


public class MenuBar {
	MenuItem[] menuItems;




	MenuBar()
	{

		menuItems = new MenuItem[]{new MenuItem("Home"),new MenuItem("MyTasks"),new MenuItem("Utils"),new MenuItem("3PillarWay"),
				new MenuItem("Reports")};



	}

	void findMenu()
	{

		System.out.println("*********Display Menu Item Module 2*********** ");
		System.out.println("List with 5 Items");

		
		for(int count = 0;count<menuItems.length;count++)
		{
			//if(menuItems[count].menuName ==TypeOfMenu)
			//{


			menuItems[count].display();

			//System.out.println(+count);
			//}
			//}
		}
		System.out.println("********3Net Display menu finished**************");
		System.out.println("<------------------------------------3Net Header finished--------------------------->");
	}
}