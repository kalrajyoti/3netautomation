import com.test.ParentForAll;


public class ThreeNetLogo extends ParentForAll{

	

	ThreeNetLogo()
	{
		arrayString = new String[]{new String("Orange"), new String("NevyBlue")};

	}
	void displayLogoColour()
	{
		System.out.println("<--------------------3net Header----------------------------> ");
		 System.out.println("********3Net company logo module 1 started*************");
		 
		System.out.println("The colour present in Company logo is :");

		for(int count=0;count<arrayString.length;count++)
		{
			System.out.println(arrayString[count]);
		}
		 System.out.println("********3Net company logo module 1 finished*************");
	}

}