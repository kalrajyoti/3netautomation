import com.test.ParentForAll;


public class TPGNetMainHeader {
	ThreeNetLogo threeNetLogo;
	MenuBar menuBar;

	TPGNetMainHeader()
	{
		threeNetLogo = new ThreeNetLogo();
		menuBar = new MenuBar();
	}



	void dispay()
	{
		try{
			String [] str = new String[]{"",""};
			threeNetLogo.displayLogoColour();
			menuBar.findMenu();
			System.out.println(str[3]);
			MenuItem m1 = new MenuItem("Test");

			ParentForAll p1 = new MenuItem("Test");
		}catch(Exception xe){
			throw xe;//xe.printStackTrace();
		}




	}
}
