import com.test.ParentForAll;


public class TPGFooterColor extends ParentForAll {
	
	
	TPGFooterColor()
	{
		arrayString = new String[]{new String("Nevy Blue")};
	}
	
	void displayFooterColor()
	{
		System.out.println("<--------------------3net Footer---------------------------->");
		System.out.println( "******3Net Background Colour Module 1 *****************");
		System.out.println("The Footor background color is :");
		for(int count =0;count<arrayString.length;count++)
		{
			System.out.println(arrayString[count]);
		}
	}
	

}
