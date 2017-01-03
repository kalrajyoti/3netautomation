import com.test.ParentForAll;


public class TPGFooterContent extends ParentForAll{
	
	
	TPGFooterContent()
	{
		arrayString = new String[] {new String("© 3Pillar Global. All Rights Reserved"),new String("3Net Updates")};
		
	}
	
	void displayFooterText()
	{
		System.out.println("**********3net Footer content Module 2**************");
		System.out.println("The Footer content written on the bottom : ");
		for(int count =0;count<arrayString.length;count++)
		{
			
			if(count ==0)
			{
				System.out.print(arrayString[count]+" | ");
			}
			else
			{
				System.out.println(arrayString[count]);
			}
		}
	}
	
	

}
