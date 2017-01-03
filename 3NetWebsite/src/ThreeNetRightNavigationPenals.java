import com.test.ParentForAll;


public class ThreeNetRightNavigationPenals extends ParentForAll{
	
	
	ThreeNetRightNavigationPenals(String Title,String[] iconList)
	{
		this.name = Title;
		arrayString = iconList;
		
	}
	void displayRightContentArea()
	{
		System.out.print(name+"(" );
		for(int count=0;count<arrayString.length;count++)
		{
		System.out.print( arrayString[count] + " ,");
		
	    }
		System.out.println(")");
	}

}
